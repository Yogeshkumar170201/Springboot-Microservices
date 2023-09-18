package com.microservices.department.service.controller;

import com.microservices.department.service.models.Department;
import com.microservices.department.service.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    DepartmentService departmentService;

    @PostMapping
    public Department addDepartment(@RequestBody Department department){
        LOGGER.info("Department Add : {}", department);
        departmentService.addDepartment(department);
        return department;
    }
}
