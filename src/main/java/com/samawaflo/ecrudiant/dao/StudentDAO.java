package com.samawaflo.ecrudiant.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.samawaflo.ecrudiant.model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {

	@Override
	public List<Student> findAll();
}
