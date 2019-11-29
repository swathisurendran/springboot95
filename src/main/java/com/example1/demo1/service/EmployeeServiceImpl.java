package com.example1.demo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example1.demo1.dao.EmployeeDao;
import com.example1.demo1.model.Employee;



@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDao empdao;

	@Transactional
	@Override
	public List<Employee> get() {
		return empdao.get();
	}

	@Transactional
	@Override
	public Employee get(int id) {
		return empdao.get(id);
	}

	@Transactional
	@Override
	public void save(Employee e) {
		empdao.save(e);
		
	}

	@Transactional
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
