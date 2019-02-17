package com.yukhlin.orgstructure.entitydtomapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.dto.DepartmentDto;
import com.yukhlin.orgstructure.factory.DepartmentFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void checkConversion() {
        Department department = DepartmentFactory.createTestDepartment();
        DepartmentDto departmentDto = departmentMapper.departmentToDepartmentDto(department);
        checkDepartmentDto(department, departmentDto);
    }

    private void checkDepartmentDto(Department department, DepartmentDto departmentDto) {
        assertEquals(department.getExternalId().toString(), departmentDto.getId());
        assertEquals(department.getName(), departmentDto.getName());
        assertEquals(department.getCreationDate(), departmentDto.getCreationDate());
    }
}