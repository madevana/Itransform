package com.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.model.Employee;
import com.springrest.service.EmployeeService;

public class EmployeeController {
	@Autowired
	EmployeeService empService;
	@GetMapping("/emp")
	public List<Employee> getEmp(){
		return empService.getEmp();
	}
	@GetMapping("/emp/{id}")
	public Employee getById(@PathVariable String id) {
		return empService.getById(id);
		
	}
	@PostMapping("/emp")
	public void addEmp(@RequestBody Employee obj) {
		empService.addEmp(obj);
	}
	@DeleteMapping("/employee/{id}")
	public Employee DelOne(@PathVariable String id) {
		return empService.delEmp(id);
	}
	@PutMapping("/employee")
	public Employee updateOne(@RequestBody Employee e) {
		return empService.updateEmp(e);
	}

}
