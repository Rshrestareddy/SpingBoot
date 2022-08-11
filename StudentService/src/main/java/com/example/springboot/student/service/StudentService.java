package com.example.springboot.student.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.springboot.student.entity.Student;
import com.example.springboot.student.repository.StudentRepository;
import com.example.springboot.student.vo.Department;
import com.example.springboot.student.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;
@Service
@Slf4j
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private RestTemplate restTemplate;

	public Student saveStudent(Student student) {
		log.info("Inside saveStudent of studentService");
		return studentRepo.save(student);
	}

	public ResponseTemplateVO getStudentWithDepartment(Long studentId) {
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Student student = studentRepo.findById(studentId).orElseThrow();
		
		Department department = restTemplate.getForObject("http://localhost:9091/department/"+student.getDepartmentId(),Department.class);
		vo.setStudent(student);
		vo.setDepartment(department);
		
		
		return vo;
	}
}
