package com.example1.demo1.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example1.demo1.model.Employee;



@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private EntityManager entitymanager;
	
	@Override
	public List<Employee> get() {
		Session currentSession=entitymanager.unwrap(Session.class);
		Query<Employee> query= currentSession.createQuery("from Employee",Employee.class);
		List<Employee> list=query.getResultList();
		return list;
	}

	@Override
	public Employee get(int id) {
		Session currentSession=entitymanager.unwrap(Session.class);
		Employee employeeobj= currentSession.get(Employee.class,id);
		return employeeobj;
	}

	@Override
	public void save(Employee e) {
		Session currentSession =entitymanager.unwrap(Session.class);
		currentSession.save(e);
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}



	
	

}
