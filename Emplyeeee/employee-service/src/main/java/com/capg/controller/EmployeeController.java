package com.capg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.model.Employee;
import com.capg.repository.EmployeeRepository;



@RestController

public class EmployeeController {

	@Autowired
	EmployeeRepository employeerepository;
	@PostMapping("/add")
	public String add(@RequestBody Employee employee) {
		employeerepository.save(employee);
				return "Employee added";
	}
	
	@GetMapping("/getemployee")
	public List<Employee> getemployee(){
		List<Employee>emp=employeerepository.findAll();
		return emp;
	}
}
