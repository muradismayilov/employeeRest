package com.muradismayilov.EmployeeService.controller;



import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import com.muradismayilov.EmployeeService.model.Employees;
import com.muradismayilov.EmployeeService.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {
	
	private final EmployeeService employeeservice;
	
	public EmployeeController (EmployeeService employeeservice ) {
		this.employeeservice = employeeservice;
	}
	
	
	private  Employees getEmployeeById (int id) {
		
		return employeeservice.getEmployeeById(id);
	} 
	
	
	@GetMapping

	public ResponseEntity<List<Employees>> getEmployees(@RequestParam(required = false) String name){
		
			
		return new ResponseEntity<>(employeeservice.getEmployees(name), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	
	public ResponseEntity<Employees> getEmployee(@PathVariable int id){
		
		
			return new ResponseEntity<>(getEmployeeById (id),HttpStatus.OK);
			
		
		
	}
	
	@PostMapping
	
	public ResponseEntity<Employees> createEmployee(@RequestBody Employees newEmployee){
		
		
		return new ResponseEntity<>(employeeservice.createEmployee(newEmployee), HttpStatus.CREATED);
		
	}
	
	@PutMapping("/{id}")
	
	public ResponseEntity<Void> getEmployee(@PathVariable int id, @RequestBody Employees newEmployee){
		
		employeeservice.updateEmployee(id, newEmployee);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable int id){
		
		employeeservice.deleteEmployee(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
}
