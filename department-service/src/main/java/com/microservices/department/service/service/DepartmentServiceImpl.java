package com.microservices.department.service.service;

import com.microservices.department.service.model.Department;
import com.microservices.department.service.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public void addDepartment(Department department) {
        departmentRepository.save(department);
    }

    @Override
    public Department getDepartmentByName(String name) {
        return departmentRepository.findByName(name);
    }
}
