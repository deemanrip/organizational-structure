package com.yukhlin.orgstructure.data.mapper;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.factory.DepartmentFactory;
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
        checkSelectedDepartmentEntity(department, 1L, "Департамент 1", LocalDate.of(2014, 12, 28));
    }

    @Test
    public void checkFindDepartments() {
        List<Department> departments = departmentMapper.findDepartments();
        assertFalse(departments.isEmpty());
    }

    @Test
    public void checkInsertDepartment() {
        Department department = DepartmentFactory.createTestDepartmentWithoutUUID();

        assertNull(department.getId());
        departmentMapper.saveDepartment(department);
        assertNotNull(department.getId());

        departmentMapper.deleteDepartmentById(department.getId());
    }

    @Test
    public void checkUpdateDepartment() {
        Department department = DepartmentFactory.createTestDepartmentWithoutUUID();
        departmentMapper.saveDepartment(department);

        String updatedName = "Updated Name";
        LocalDate updatedCreationDate = LocalDate.of(2010, 5, 20);
        department.setName(updatedName);
        department.setCreationDate(updatedCreationDate);

        departmentMapper.updateDepartmentById(department);
        department = departmentMapper.findById(department.getId());
        checkSelectedDepartmentEntity(department, department.getId(), updatedName, updatedCreationDate);

        departmentMapper.deleteDepartmentById(department.getId());
    }

    private void checkSelectedDepartmentEntity(Department department, Long idToCompare, String nameToCompare, LocalDate creationDateToCompare) {
        assertEquals(idToCompare, department.getId());
        assertNotNull(department.getExternalId());
        assertEquals(nameToCompare, department.getName());
        assertEquals(creationDateToCompare, department.getCreationDate());
    }
}