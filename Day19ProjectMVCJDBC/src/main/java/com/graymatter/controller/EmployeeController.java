package com.graymatter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.graymatter.model.Employee;
import com.graymatter.service.EmployeeService;

@Controller

public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	
	@RequestMapping("/employee")
	public ModelAndView getAllEmployees(){
		
		List<Employee> empList =service.getAllEmployees();
		ModelAndView mv=new ModelAndView("employee");
		mv.addObject("empList",empList);
		for(Employee e:empList)
		System.out.println(e);
		return mv;
		
	}

}
