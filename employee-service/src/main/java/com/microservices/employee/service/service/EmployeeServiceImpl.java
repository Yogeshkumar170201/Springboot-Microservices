package com.microservices.employee.service.service;

import com.microservices.employee.service.models.Department;
import com.microservices.employee.service.models.Employee;
import com.microservices.employee.service.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public void addEmployee(Employee employee) throws Exception {
        if(employee!=null) {
            employeeRepository.save(employee);
        }else {
            throw new Exception("Fill all the details");
        }
    }

    @Override
    public Employee getEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
