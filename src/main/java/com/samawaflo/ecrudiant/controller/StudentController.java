package com.samawaflo.ecrudiant.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping(value="/ecrudiant/rest/students")
	public Student newStudent(@RequestBody Student newStudent){
		return studentService.saveStudent(newStudent);
	}
	
	@PutMapping(value="/ecrudiant/rest/students/{id}")
	public Student updateStudent(@RequestBody Student newStudent,  @PathVariable Long id){
		return studentService.replaceStudent(newStudent,id);
	}
}
