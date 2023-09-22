package com.microservices.employee.service.client;

import com.microservices.employee.service.models.Department;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface DepartmentClient {

    @GetExchange("department/{name}")
    public Department getDepartmentByName(@PathVariable("name") String name);

}
