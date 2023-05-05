package com.student.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.student.model.Student;


public interface StudentDAO {

	public int save(Student student);

	public int update(Student student);

	public Student get(Integer id);

	public List<Student> list();

	public int delete(Integer id);
	
   public List<Student>searchEmployee(String email);
}
