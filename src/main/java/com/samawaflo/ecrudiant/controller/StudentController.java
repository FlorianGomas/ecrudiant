package com.samawaflo.ecrudiant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.samawaflo.ecrudiant.model.Student;
import com.samawaflo.ecrudiant.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/ecrudiant/rest/students")
	public List<Student> loadAllStudent(){
		return studentService.findAll();
	}
}
