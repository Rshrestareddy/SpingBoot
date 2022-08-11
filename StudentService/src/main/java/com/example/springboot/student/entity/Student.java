package com.example.springboot.student.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long studentId;
	private String studentName;
	private String studentEmailId;
	private String StudentCode;
	private Long departmentId;
	
	
}


