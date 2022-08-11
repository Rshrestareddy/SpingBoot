package com.example.springboot.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.student.entity.Student;
import com.example.springboot.student.service.StudentService;
import com.example.springboot.student.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/student")
@Slf4j
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/")
	public Student saveStudent(@RequestBody Student student) {
		log.info("Inside saveStudent of Studentcontroller");
		return studentService.saveStudent(student);
	}
	
	@GetMapping("/{id}")
	public ResponseTemplateVO getStudentWithDepartment(@PathVariable("id") Long studentId) {
		return studentService.getStudentWithDepartment(studentId);
		
	}
	
}
