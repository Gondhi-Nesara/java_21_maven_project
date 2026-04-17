package com.example.employeemanagement.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.employeemanagement.dto.Employee;
import com.example.employeemanagement.repository.EmployeeRepository;

@Repository
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository erepo;
	
	public String createEmployee(Employee e) {
		erepo.save(e);
		return "Employee crearted";
	}
	
	public void deleteEmployee(long id) {
		erepo.deleteById(id);
	}
	
	public Optional<Employee> getEmployeeById(Long empid) {
		Optional<Employee> opt1 = erepo.findById(empid);
		return opt1;
	}
}
