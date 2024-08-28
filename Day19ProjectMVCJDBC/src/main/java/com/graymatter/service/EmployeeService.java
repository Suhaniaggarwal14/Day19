package com.graymatter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.graymatter.dao.EmployeeDao;
import com.graymatter.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	public List<Employee> getAllEmployees(){	
		return empDao.getAllEmployees();	
	}
	
	
	public int addEmployee(Employee employee) {
		return empDao.addEmployee(employee);
	}
	
	
	public int updateEmployee(Employee employee) {
		return empDao.updateEmployee(employee);
	}
	
	
	public Employee getEmployeeById(int empId) {
		return empDao.getEmployeeById(empId);
	}

}
