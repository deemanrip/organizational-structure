package com.yukhlin.orgstructure.controller;

import com.yukhlin.orgstructure.dto.DepartmentDto;
import com.yukhlin.orgstructure.entitydtomapper.DepartmentMapper;
import com.yukhlin.orgstructure.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/departments", consumes = "application/json", produces = "application/json")
public class DepartmentController {

    private DepartmentService departmentService;
    private DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentController(DepartmentService departmentService, DepartmentMapper departmentMapper) {
        this.departmentService = departmentService;
        this.departmentMapper = departmentMapper;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<DepartmentDto>> getDepartments() {
        List<DepartmentDto> departments = departmentService.findDepartments().stream()
                .map(d -> departmentMapper.departmentToDepartmentDto(d))
                .collect(Collectors.toList());

        return new ResponseEntity<>(departments, HttpStatus.OK);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<DepartmentDto> getDepartmentById(@PathVariable String id) {
        DepartmentDto departmentDto = departmentMapper
                .departmentToDepartmentDto(departmentService.findByExternalId(UUID.fromString(id)));

        return new ResponseEntity<>(departmentDto, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity addDepartment(@RequestBody DepartmentDto departmentDto) {
        departmentService.saveDepartment( departmentMapper.departmentDtoToDepartment(departmentDto) );

        return new ResponseEntity(HttpStatus.CREATED);
    }

}