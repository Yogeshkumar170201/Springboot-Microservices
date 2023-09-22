package com.microservices.department.service.controller;

import com.microservices.department.service.model.Department;
import com.microservices.department.service.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @PostMapping
    public String addDepartment(@RequestBody Department department){
        departmentService.addDepartment(department);
        return "Success";
    }

    @GetMapping("/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name){
        Department department = departmentService.getDepartmentByName(name);
        return department;
    }
}
