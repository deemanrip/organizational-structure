package com.yukhlin.orgstructure.factory;

import com.yukhlin.orgstructure.data.domain.Department;

import java.time.LocalDate;
import java.util.UUID;

public class DepartmentFactory {

    private DepartmentFactory() {
    }

    public static Department createTestDepartment() {
        Department department = new Department();
        department.setExternalId(UUID.randomUUID());
        department.setCreationDate(LocalDate.now());
        department.setName("Test department");

        return department;
    }
}