package com.example.employeemanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.employeemanagement.dao.EmployeeDAO;
import com.example.employeemanagement.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO edao;
	
	public String createEmployee(Employee e) {
		return edao.createEmployee(e);
	}
	
//	public String deleteEmployee(long id) {
//		Optional<Employee> opt = edao.getEmployeeById(id);
//		if(opt.isEmpty) {
//			return "No Employees";
//		}
//		edao.deleteEmployee(id);
//		return "Employee deleted";
//	}
	
	public Employee getEmployeeById(Long empid) {
		Optional<Employee> opt1 = edao.getEmployeeById(empid);
		if(opt1.isPresent()) {
			return opt1.get();
		}
		else return null;
	}
	

	
	
}
