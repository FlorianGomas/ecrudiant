package com.samawaflo.ecrudiant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.samawaflo.ecrudiant.model.Student;
import com.samawaflo.ecrudiant.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/ecrudiant/rest/students")
	public List<Student> loadAllStudents(){
		return studentService.findAll();
	}
	
	@GetMapping(value="/ecrudiant/rest/students/{id}")
	public Student loadStudent(@PathVariable("id") long id){
		return studentService.findStudent(id);
	}
}
