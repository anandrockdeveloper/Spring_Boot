package com.anand.springboot.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anand.springboot.person.Employee;
import com.anand.springboot.person.EmployeeAnotated;
import com.anand.springboot.service.PersonService;

@RestController
public class ControllerObject {

	@Autowired
	PersonService employeeList;
	
	@RequestMapping("/Employee")
	public List<EmployeeAnotated> getEmployees()
	{
		return employeeList.getEmployees();
	}
	
	@RequestMapping("/Employee/{id}")
	public Optional<EmployeeAnotated> getEmployee(@PathVariable int id)
	{
		return employeeList.getEmployee(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/Employee")
	public List<EmployeeAnotated> getPOSTEmployees(@RequestBody EmployeeAnotated employee)
	{
		return employeeList.addEmployye(employee);
	}
	
	

}
