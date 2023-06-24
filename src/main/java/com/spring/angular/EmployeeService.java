package com.spring.angular;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeDAO employeeDAO;
	public Iterable<Employee>getAllEmployees()
	{
		return employeeDAO.findAll();
	}
}
