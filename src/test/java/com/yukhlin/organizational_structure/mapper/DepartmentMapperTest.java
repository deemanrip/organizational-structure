package com.yukhlin.organizational_structure.mapper;

import com.yukhlin.organizational_structure.domain.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void checkFindDepartmentById() {
        Department department = departmentMapper.findById(1L);
        assertNotNull(department);
        assertEquals("Департамент 1", department.getName());
        assertEquals(LocalDate.of(2014, 12, 28), department.getCreationDate());
    }
}