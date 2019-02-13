package com.yukhlin.organizational_structure.mapper;

import com.yukhlin.organizational_structure.domain.Department;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartmentMapperTest {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Test
    public void checkFindDepartmentById() {
        Department department = departmentMapper.findById(1L);
        assertNotNull(department);
        checkInitializedDepartment(department, 1L, "Департамент 1", LocalDate.of(2014, 12, 28));
    }

    @Test
    public void checkFindDepartments() {
        List<Department> departments = departmentMapper.findDepartments();
        assertFalse(departments.isEmpty());

        Department department = departments.get(1);
        checkInitializedDepartment(department, 2L, "Департамент 2", LocalDate.of(2013, 5, 11));
    }

    private void checkInitializedDepartment(Department department, Long idToCompare, String nameToCompare, LocalDate creationDateToCompare) {
        assertEquals(idToCompare, department.getId());
        assertNotNull(department.getExternalId());
        assertEquals(nameToCompare, department.getName());
        assertEquals(creationDateToCompare, department.getCreationDate());
    }
}