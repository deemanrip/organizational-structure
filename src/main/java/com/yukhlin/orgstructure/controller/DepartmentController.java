package com.yukhlin.orgstructure.controller;

import com.yukhlin.orgstructure.entitydtomapper.DepartmentMapper;
import com.yukhlin.orgstructure.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/departments", consumes = "application/json", produces = "application/json")
public class DepartmentController {

    private DepartmentService departmentService;
    private DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentController(DepartmentService departmentService, DepartmentMapper departmentMapper) {
        this.departmentService = departmentService;
    }
}