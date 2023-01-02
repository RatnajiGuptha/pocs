package com.Spring.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue
	private int StudentId;
	private String name;
	private String emaiId;

	public Student(int studentId, String name, String emaiId) {
		super();
		StudentId = studentId;
		this.name = name;
		this.emaiId = emaiId;
	}

	public Student() {
		super();
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmaiId() {
		return emaiId;
	}

	public void setEmaiId(String emaiId) {
		this.emaiId = emaiId;
	}

}
