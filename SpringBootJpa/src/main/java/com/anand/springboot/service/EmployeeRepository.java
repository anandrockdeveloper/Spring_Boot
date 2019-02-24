package com.anand.springboot.service;

import org.springframework.data.repository.CrudRepository;

import com.anand.springboot.person.EmployeeAnotated;

public interface EmployeeRepository extends CrudRepository<EmployeeAnotated,Integer>{

}
