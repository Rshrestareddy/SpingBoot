package com.example.springbootbackend.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootbackend.model.Employee;
import com.example.springbootbackend.repository.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	public EmployeeRepo employeeRepo;
	
	// Save Employee details
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	// Get List of employees
	@Override
	public List<Employee> employeeList() {
		
		return (List<Employee>)employeeRepo.findAll();
	}
	
	// Update employee details
	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		
		Employee emp = employeeRepo.findById(id).get();
		
		//updating the name 
		if(Objects.nonNull(employee.getName()) 
				&& !"".equalsIgnoreCase(employee.getName())) {
			emp.setName(employee.getName());
		}
		
		//updating the course
		if(Objects.nonNull(employee.getCourse())
				&& !"".equalsIgnoreCase(employee.getCourse())) {
			emp.setCourse(employee.getCourse());
		}
		return employeeRepo.save(emp);
	}

    //Delete employee
	@Override
	public void deleteEmployeebyId(long id) {
		employeeRepo.deleteById(id);
		
	}

	
}
