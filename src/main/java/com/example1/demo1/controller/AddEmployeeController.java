package com.example1.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/add")
public class AddEmployeeController {

	@RequestMapping("/emp")
	public String addEmployee(){
		return "Employee";
	}
}
