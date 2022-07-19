package com.example.bootJPA1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.bootJPA1.dao.StudentRepo;
import com.example.bootJPA1.model.Student;

@Controller
public class StudentController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addStudent") 
	public String addStudent(Student student) {
		repo.save(student);
		return "home.jsp";
	}
	
	
}
