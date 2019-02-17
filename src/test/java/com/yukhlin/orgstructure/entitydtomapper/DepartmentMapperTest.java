package com.yukhlin.orgstructure.entitydtomapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.dto.DepartmentDto;
import com.yukhlin.orgstructure.factory.DepartmentFactory;
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
    public void checkEntityDtoConversion() {
        Department department = DepartmentFactory.createTestDepartmentWithUUID();
        DepartmentDto departmentDto = departmentMapper.departmentToDepartmentDto(department);
        checkConvertedObjects(department, departmentDto);
    }

    @Test
    public void checkDtoEntityConversion() {
        DepartmentDto departmentDto = new DepartmentDto();
        departmentDto.setId(UUID.randomUUID().toString());
        departmentDto.setName("Test department");
        departmentDto.setCreationDate(LocalDate.now());

        Department department = departmentMapper.departmentDtoToDepartment(departmentDto);
        checkConvertedObjects(department, departmentDto);
    }

    private void checkConvertedObjects(Department department, DepartmentDto departmentDto) {
        assertEquals(department.getExternalId().toString(), departmentDto.getId());
        assertEquals(department.getName(), departmentDto.getName());
        assertEquals(department.getCreationDate(), departmentDto.getCreationDate());
    }
}