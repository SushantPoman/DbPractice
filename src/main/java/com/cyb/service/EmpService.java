package com.cyb.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cyb.entities.Employee;
import com.cyb.exception.InvalidNumber;
import com.cyb.repository.EmpRepository;

@Service
public class EmpService {

	@Autowired
	EmpRepository repository;
	
	public List<Employee> getAllEmployees(){
		return repository.findAll();
	}
	
	public Employee saveEmployees(Employee employee){
		return repository.save(employee);
	}
	
	public Employee findByDetail(String detail) {
		Optional<Employee> employee = repository.findByDetail(detail);
//		if(employee.isPresent())
//			return employee.get();
//		else 
//			throw new InvalidNumber("employee.number");
		
		return employee.orElseThrow(() -> new InvalidNumber("employee.number"));
	}
	
	
}
