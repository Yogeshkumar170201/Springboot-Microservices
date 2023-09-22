package com.microservices.employee.service.controller;

import com.microservices.employee.service.client.DepartmentClient;
import com.microservices.employee.service.models.Department;
import com.microservices.employee.service.models.Employee;
import com.microservices.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentClient departmentClient;

    @PostMapping
    public String addEmployee(@RequestBody Employee employee) {
        try {
            employeeService.addEmployee(employee);
            return "Success";
        } catch (Exception e) {
            return e.getMessage();
        }
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }


    @GetMapping("/{name}")
    public Employee getEmployeeByName(@PathVariable("name") String name) {
        return employeeService.getEmployeeByName(name);
    }


    @GetMapping("/department/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name){
        return departmentClient.getDepartmentByName(name);
    }
}
