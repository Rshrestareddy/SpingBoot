package com.example.springbootbackend.service;

import java.util.List;

import com.example.springbootbackend.model.Employee;

public interface EmployeeService  {
	
	
//	Save operation
	Employee saveEmployee(Employee employee);
	
//	Read operation
	List<Employee> employeeList();
	
//	Update operation
	Employee updateEmployee(Employee employee, Long id);
	
//	Delete operation,
	void deleteEmployeebyId(long id);
}
