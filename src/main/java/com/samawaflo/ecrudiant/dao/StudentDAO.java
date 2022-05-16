package com.samawaflo.ecrudiant.dao;

import org.springframework.data.repository.CrudRepository;

import com.samawaflo.ecrudiant.model.Student;

public interface StudentDAO extends CrudRepository<Student, Long> {

}
