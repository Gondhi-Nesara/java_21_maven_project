package com.example.employeemanagement.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private Long empid;
	private String name;
	private String email;
	private String department;
	private Double salary;
	
	public long getId() {
		return empid;
	}
	public void setId(long empid) {
		this.empid = empid;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + empid + ", name=" + name + ", email=" + email + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	
}
