package com.wewe.accessingdatamysql.repository;

import com.wewe.accessingdatamysql.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    List<Employee> findByLastName(String lastName);
    Employee findById(long id);
}
