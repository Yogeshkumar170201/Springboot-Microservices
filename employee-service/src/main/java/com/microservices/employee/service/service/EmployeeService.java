package com.microservices.employee.service.service;

import com.microservices.employee.service.models.Department;
import com.microservices.employee.service.models.Employee;

import java.util.List;

public interface EmployeeService {

    void addEmployee(Employee employee) throws Exception;

    Employee getEmployeeByName(String name);

    List<Employee> getAllEmployees();
}
