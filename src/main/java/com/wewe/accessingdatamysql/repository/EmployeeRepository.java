package com.wewe.azurepoc.accessingdatajpa.repository;

import com.wewe.azurepoc.accessingdatajpa.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    List<Employee> findByLastName(String lastName);
    Employee findById(long id);
}
