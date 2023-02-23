package com.muradismayilov.EmployeeService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.muradismayilov.EmployeeService.model.Employees;
import com.muradismayilov.EmployeeService.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	public EmployeeService (EmployeeRepository employeeRepository ) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employees> getEmployees(String name) {

		if (name == null) {
			return employeeRepository.findAll();
		}else {
			return employeeRepository.findByName(name);
		}
	}

	public Employees createEmployee(Employees newEmployee) {
		
		return employeeRepository.save(newEmployee);
	}

	

	public void deleteEmployee(int id) {
		
		employeeRepository.deleteById(id);
		
	}

	public Employees getEmployeeById(int id) {
		
		Optional<Employees> byId = employeeRepository.findById(id);
		
		if(byId.isEmpty()) {
			throw( new RuntimeException("Employee isnot found"));
		}return byId.get();
		
				
		
	}

	public void updateEmployee(int id, Employees newEmployee) {
		Employees oldEmployee = getEmployeeById(id);
		oldEmployee.setName(newEmployee.getName());
		oldEmployee.setSurname(newEmployee.getSurname());
		oldEmployee.setFatherName(newEmployee.getFatherName());
		oldEmployee.setUserName(newEmployee.getUserName());
		oldEmployee.setBirthDate(newEmployee.getBirthDate());
		oldEmployee.setGender(newEmployee.getGender());
		oldEmployee.setWorkOrnot(newEmployee.getWorkOrnot());
		oldEmployee.setPassword(newEmployee.getPassword());
		oldEmployee.setPasswordDate(newEmployee.getPasswordDate());
		oldEmployee.setDirector(newEmployee.getDirector());
		oldEmployee.setRegistrationDate(newEmployee.getRegistrationDate());
		employeeRepository.save(oldEmployee);
		
	}


	
}
