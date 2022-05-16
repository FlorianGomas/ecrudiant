package com.samawaflo.ecrudiant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.samawaflo.ecrudiant.dao.StudentDAO;
import com.samawaflo.ecrudiant.model.Student;

@Component
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;
	
	public List<Student> findAll() {
		return studentDAO.findAll();
	}

	public Student findStudent(long id) {
		return studentDAO.findById(id).get();
	}

	public Student saveStudent(Student newStudent) {
		return studentDAO.save(newStudent);
	}

}
