package com.wewe.azurepoc.accessingdatajpa;

import com.wewe.azurepoc.accessingdatajpa.entity.Employee;
import com.wewe.azurepoc.accessingdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employee-details/{lastName}")
    public List<Employee> getEmployeeById(@PathVariable String lastName){
        return employeeRepository.findByLastName(lastName);
    }
}
