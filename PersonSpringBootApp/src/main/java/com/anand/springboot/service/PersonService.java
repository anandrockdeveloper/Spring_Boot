package com.anand.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.anand.springboot.person.Employee;

@Service
public class PersonService {

	private List<Employee> employeeList=new ArrayList<Employee>(Arrays.asList(
			new Employee("Anand", "P", 435),
			new Employee("Tejas", "P", 1325),
			new Employee("Karthik", "B", 800)));

	public List<Employee> getEmployees(){
		return employeeList;
	}

	public Employee getEmployee(String fName)
	{
		return employeeList.stream().filter(t -> t.getFirstName().equals(fName)).findFirst().get();

	}

	public List<Employee> addEmployye(Employee employee) {
		employeeList.add(employee);
		return getEmployees();
		
	}

}
