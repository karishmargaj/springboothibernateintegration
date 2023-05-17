package com.cognizant.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.springframework.stereotype.Component;

import com.cognizant.model.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao{

	public static SessionFactory  factory=new AnnotationConfiguration().configure().buildSessionFactory();
	
	@Override
	public void saveData(Employee employee) {
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		session.save(employee);
		transaction.commit();
		
	}

	@Override
	public List<Employee> getAllData() {
		Session session=factory.openSession();
		return session.createQuery("from Employee").list();
	}

}
