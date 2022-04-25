package com.wewe.azurepoc.accessingdatajpa.repository;

import com.wewe.azurepoc.accessingdatajpa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void run(String... args) throws Exception {
        Employee employee = new Employee("Bill", "Gates");
        employeeRepository.save(employee);
        Employee employee1 = new Employee("Tom", "Gates");
        employeeRepository.save(employee1);
        Employee employee3 = new Employee("Tim", "Cook");
        employeeRepository.save(employee3);
    }
}
