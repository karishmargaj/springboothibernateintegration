package com.cognizant.service;

import java.util.List;

import com.cognizant.model.Employee;

public interface EmployeeService {
	
public void saveData(Employee employee);
	
	public List<Employee> getAllData();

}
