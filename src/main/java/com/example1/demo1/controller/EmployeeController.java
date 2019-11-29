package com.example1.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example1.demo1.model.Employee;
import com.example1.demo1.service.EmployeeService;



@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> get(){
		return employeeService.get();		
	}
	
	@PostMapping("/employee")
	public Employee save(@RequestBody Employee emp ){
		employeeService.save(emp);
		return emp;
	}
	
	@GetMapping("/employee/{id}")
	public Employee get(@PathVariable int id){
		return employeeService.get(id);
		
	}
	

}
