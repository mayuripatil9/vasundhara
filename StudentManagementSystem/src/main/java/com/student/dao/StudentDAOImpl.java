package com.student.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.student.model.Student;

public class StudentDAOImpl implements StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public StudentDAOImpl(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Student student) {
		String sql = "INSERT INTO student (name, email, rollNo) VALUES (?, ?, ?)";
		return jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getRollNo());
	}
	

	@Override
	public int update(Student student) {
		String sql = "UPDATE student SET name = ?, email = ?, rollNo = ? WHERE id = ?";
		return jdbcTemplate.update(sql, student.getName(), student.getEmail(), student.getRollNo(), student.getId());
	}

	@Override
	public Student get(Integer id) {
		String sql = "SELECT * FROM student WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public List<Student> list() {
		String sql = "SELECT * FROM student";
		return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Student>(Student.class));
	}

	@Override
	public int delete(Integer id) {
		String sql = "DELETE FROM student WHERE id = ?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public List<Student> searchEmployee(String email) {
		return null;
	}

	
	
}
