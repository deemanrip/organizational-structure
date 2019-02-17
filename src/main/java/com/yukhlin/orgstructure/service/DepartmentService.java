package com.yukhlin.orgstructure.service;

import com.yukhlin.orgstructure.data.domain.Department;

import java.util.List;
import java.util.UUID;

public interface DepartmentService {

    Department findById(Long id);
    Department findByExternalId(UUID externalId);
    List<Department> findDepartments();
    void saveDepartment(Department department);
    void updateDepartment(Department department);
    void deleteDepartment(UUID externalId);

}