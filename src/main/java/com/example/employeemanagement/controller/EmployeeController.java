package com.example.employeemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.employeemanagement.dto.Employee;
import com.example.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/api/employees/")
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@PostMapping
	public String createEmployee(@RequestBody Employee e) {
		return es.createEmployee(e);
	}
	
//	@DeleteMapping("id")
//	public String deleteEmployee(@RequestParam long id) {
//		return es.deleteEmployee(id);
//	}
	
	@GetMapping("empid")
	public Employee getEmployeeById(@RequestParam Long empid) {
		return es.getEmployeeById(empid);
	}

}
