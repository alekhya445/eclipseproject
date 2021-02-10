package com.model;

public class Student {
	
	private int studNo;
	private String studentName;
	private float age;
	
	//default constructor with no arguments//
	
	public Student() {
		super();
	}

	public Student(int studNo, String studentName, float age) {
		super();
		this.studNo = studNo;
		this.studentName = studentName;
		this.age = age;
	}
	
	
	//getters and setters//

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getAge() {
		return age;
	}

	public void setAge(float age) {
		this.age = age;
	}
	
	
	

}
