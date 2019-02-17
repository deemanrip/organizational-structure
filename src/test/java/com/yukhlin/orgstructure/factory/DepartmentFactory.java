package com.yukhlin.orgstructure.factory;

import com.yukhlin.orgstructure.data.domain.Department;

import java.time.LocalDate;
import java.util.UUID;

public class DepartmentFactory {

    private DepartmentFactory() {
    }

    public static Department createTestDepartmentWithUUID() {
        Department department = new Department();
        department.setExternalId(UUID.randomUUID());
        department.setCreationDate(LocalDate.now());
        department.setName("Test department");

        return department;
    }

    public static Department createTestDepartmentWithoutUUID() {
        Department department = new Department();
        department.setCreationDate(LocalDate.now());
        department.setName("Test department");

        return department;
    }
}