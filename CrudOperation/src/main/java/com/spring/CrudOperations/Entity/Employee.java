package com.spring.CrudOperations.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Employee_id;
	private String First_name;
	private String Last_name;
	private String Department;
	private long moblie_number;
	private String Role;
	
	public Employee() {
		super();
	}

	public Employee(long employee_id, String first_name, String last_name, String role, String department,
			long moblie_number) {
		super();
		Employee_id = employee_id;
		First_name = first_name;
		Last_name = last_name;
		Role = role;
		Department = department;
		this.moblie_number = moblie_number;
	}

	public long getEmployee_id() {
		return Employee_id;
	}

	public void setEmployee_id(long employee_id) {
		Employee_id = employee_id;
	}

	public String getFirst_name() {
		return First_name;
	}

	public void setFirst_name(String first_name) {
		First_name = first_name;
	}

	public String getLast_name() {
		return Last_name;
	}

	public void setLast_name(String last_name) {
		Last_name = last_name;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public long getMoblie_number() {
		return moblie_number;
	}

	public void setMoblie_number(long moblie_number) {
		this.moblie_number = moblie_number;
	}

	@Override
	public String toString() {
		return "Employee [Employee_id=" + Employee_id + ", First_name=" + First_name + ", Last_name=" + Last_name
				+ ", Role=" + Role + ", Department=" + Department + ", moblie_number=" + moblie_number + "]";
	}

}
