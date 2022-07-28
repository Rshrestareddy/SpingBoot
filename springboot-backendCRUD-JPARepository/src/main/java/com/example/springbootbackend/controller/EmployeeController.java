package com.example.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.model.Employee;
import com.example.springbootbackend.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
		
//	Save operation
	@PostMapping("/employees")
	public Employee saveEmploye( @RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
//	Read operation
	@GetMapping("/EmployeeList")
	public List<Employee> employeeList(){
		return employeeService.employeeList();
	}
	
//	Update operation
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("id") Long id) {
		
		return employeeService.updateEmployee(employee, id);
	}
	
//	Delete operation,
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeebyId(@PathVariable("id") long id){
		employeeService.deleteEmployeebyId(id);
		return "Deleted Sucessfully";
	}
	
}
