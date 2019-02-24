package com.anand.springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anand.springboot.person.Employee;
import com.anand.springboot.person.EmployeeAnotated;

@Service
public class PersonService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	private List<Employee> employeeList=new ArrayList<Employee>(Arrays.asList(
			new Employee("Anand", "P", 435),
			new Employee("Tejas", "P", 1325),
			new Employee("Karthik", "B", 800)));

	public List<EmployeeAnotated> getEmployees(){
		
		List<EmployeeAnotated> employeeList= new ArrayList<>();
		employeeRepository.findAll().forEach(employeeList::add);
		return employeeList;
	}

	public Optional<EmployeeAnotated> getEmployee(int id)
	{
		return employeeRepository.findById(id);

	}

	public List<EmployeeAnotated> addEmployye(EmployeeAnotated employee) {
		employeeRepository.save(employee);
		return getEmployees();
		
	}

}
