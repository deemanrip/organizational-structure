package com.yukhlin.orgstructure.service;

import com.yukhlin.orgstructure.data.domain.Department;
import com.yukhlin.orgstructure.data.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentMapper departmentMapper;

    @Autowired
    public DepartmentServiceImpl(DepartmentMapper departmentMapper) {
        this.departmentMapper = departmentMapper;
    }

    @Override
    public Department findById(Long id) {
        return departmentMapper.findById(id);
    }

    @Override
    public Department findByExternalId(UUID externalId) {
        return departmentMapper.findByExternalId(externalId);
    }

    @Override
    public List<Department> findDepartments() {
        return departmentMapper.findDepartments();
    }

    @Override
    public void saveDepartment(Department department) {
        departmentMapper.saveDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
        departmentMapper.updateDepartment(department);
    }

    @Override
    public void deleteDepartment(UUID externalId) {
        departmentMapper.deleteDepartment(externalId);
    }
}