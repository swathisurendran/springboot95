package com.example1.demo1.service;

import java.util.List;

import com.example1.demo1.model.Employee;



public interface EmployeeService {

	List<Employee> get();
	Employee get(int id);
	void save(Employee e);
	void delete(int id);
}
