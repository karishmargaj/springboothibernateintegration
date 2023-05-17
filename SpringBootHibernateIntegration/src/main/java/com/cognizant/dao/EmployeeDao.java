package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Employee;

public interface EmployeeDao {
	
	public void saveData(Employee employee);
	
	public List<Employee> getAllData();
	

}
