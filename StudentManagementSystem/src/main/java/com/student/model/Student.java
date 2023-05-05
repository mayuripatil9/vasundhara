package com.student.model;

public class Student {

	private Integer id;
	private String name;
	private String email;
	private String rollNo;
	
	public Student(Integer id, String name, String email, String rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rollNo = rollNo;
		
	}

	public Student(String name, String email, String rollNo) {
		super();
		this.name = name;
		this.email = email;
		this.rollNo = rollNo;
		
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
    
}
