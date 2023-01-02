package com.Spring.Demo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Department {
	
	@Id
	private int department_id;
	private String department_name;
	private String hod;

	public Department() {
		super();
	}

	public Department(int department_id, String department_name, String hod) {
		super();
		this.department_id = department_id;
		this.department_name = department_name;
		this.hod = hod;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getHod() {
		return hod;
	}

	public void setHod(String hod) {
		this.hod = hod;
	}

}
