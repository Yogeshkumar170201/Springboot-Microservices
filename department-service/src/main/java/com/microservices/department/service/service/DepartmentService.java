package com.microservices.department.service.service;

import com.microservices.department.service.model.Department;

public interface DepartmentService {
    void addDepartment(Department department);

    Department getDepartmentByName(String name);
}
