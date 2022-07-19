package com.example.bootJPA1.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.bootJPA1.model.Student;


public interface StudentRepo extends CrudRepository<Student, Integer>
{
	
	
}
