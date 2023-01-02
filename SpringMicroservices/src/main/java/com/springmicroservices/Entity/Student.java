package com.springmicroservices.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int student_id;
	private String first_name;
	private String last_name;
	private String moblie_number;
	private String email_id;

	public Student() {
		super();
	}

	public Student(String first_name, String last_name, String moblie_number, String email_id) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.moblie_number = moblie_number;
		this.email_id = email_id;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMoblie_number() {
		return moblie_number;
	}

	public void setMoblie_number(String moblie_number) {
		this.moblie_number = moblie_number;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

}
