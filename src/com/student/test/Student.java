package com.student.test;

public class Student {

	private int rollNo;
	private String name;
	private String course;
	private String address;
	
	public Student(int rollNo, String name, String course, String address) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
}
