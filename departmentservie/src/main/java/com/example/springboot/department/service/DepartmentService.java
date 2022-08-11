package com.example.springboot.department.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.department.entity.Department;
import com.example.springboot.department.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepo;

	public Department saveDepartment(Department department) {
		
		return departmentRepo.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		
		return departmentRepo.findById(departmentId).orElseThrow();
	}
	
	
	
	

}
