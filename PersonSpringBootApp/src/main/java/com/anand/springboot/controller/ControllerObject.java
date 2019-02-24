package com.anand.springboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anand.springboot.person.Employee;
import com.anand.springboot.service.PersonService;

@RestController
public class ControllerObject {

	@Autowired
	PersonService employeeList;
	
	@RequestMapping("/Employee")
	public List<Employee> getEmployees()
	{
		return employeeList.getEmployees();
	}
	
	@RequestMapping("/Employee/{firstName}")
	public Employee getEmployee(@PathVariable String firstName)
	{
		return employeeList.getEmployee(firstName);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Employee")
	public List<Employee> getPOSTEmployees(@RequestBody Employee employee)
	{
		return employeeList.addEmployye(employee);
	}
	
	

}
