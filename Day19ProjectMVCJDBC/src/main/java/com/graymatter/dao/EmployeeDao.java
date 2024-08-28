package com.graymatter.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.graymatter.model.Employee;

@Component
public class EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//crud operations
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	//insert query
	public int addEmployee(Employee emp) {
		//insert into employee values ( 123,'swapna',50000)
		String query="insert into employee values ("+emp.getEmpId()+",'"+emp.getEmpId()+"',"+emp.getEmpSal()+");";
		return jdbcTemplate.update(query);
		
	}
	
	//select query
	public List<Employee> getAllEmployees(){
		String query="select * from employee";
		List<Employee> empList=jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
	}
	
	//update query
	public int updateEmployee(Employee emp) {
		//update employee set empsal=56000 where empid=123
		String query="update employee set empSal="+emp.getEmpSal()+"where empId="+emp.getEmpId();
		return jdbcTemplate.update(query);
	}

	//delete query
	
	//getEmployeeById
	public Employee getEmployeeById(int empId) {
		String query="select * from employee where empId="+empId;
		List<Employee> empList=jdbcTemplate.query(query,new EmployeeRowMapper());
		return empList.get(0);
	}

}
