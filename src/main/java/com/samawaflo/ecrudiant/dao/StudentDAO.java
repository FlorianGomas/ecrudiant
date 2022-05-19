package com.samawaflo.ecrudiant.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.samawaflo.ecrudiant.model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {

	/**
	 * Override of findAll() from the CrudRepository which normally return Iterable<Entities>
	 */
	@Override
	public List<Student> findAll();
	
	public List<Student> findAllByOrderByLastName();
}
