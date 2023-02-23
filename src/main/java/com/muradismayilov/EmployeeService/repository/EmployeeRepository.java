package com.muradismayilov.EmployeeService.repository;


import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.muradismayilov.EmployeeService.model.Employees;

public interface EmployeeRepository extends MongoRepository<Employees, Integer> {

	List<Employees> findByName(String name);
   
}
