package com.yukhlin.orgstructure.entitydtomapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.dto.DepartmentDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void checkConversion() {
        Department department = createDepartment();
        DepartmentDto departmentDto = departmentMapper.departmentToDepartmentDto(department);
        checkDepartmentDto(department, departmentDto);
    }

    private Department createDepartment() {
        Department department = new Department();
        department.setId(1L);
        department.setExternalId(UUID.randomUUID());
        department.setCreationDate(LocalDate.now());
        department.setName("Test department");

        return department;
    }

    private void checkDepartmentDto(Department department, DepartmentDto departmentDto) {
        assertEquals(department.getExternalId().toString(), departmentDto.getId());
        assertEquals(department.getName(), departmentDto.getName());
        assertEquals(department.getCreationDate(), departmentDto.getCreationDate());
    }
}