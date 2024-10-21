package com.cyb.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.cyb.entities.Employee;
import com.cyb.service.EmpService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/emp")
public class EmpController {

	@Autowired
	EmpService service;
	
	
	@GetMapping
	public ResponseEntity<List<Employee>> getAllEmployee(){
		return new ResponseEntity<List<Employee>>(service.getAllEmployees(), HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@Valid @RequestBody Employee employee){
		return new ResponseEntity<Employee>(service.saveEmployees(employee), HttpStatus.CREATED);
	}
	
	@GetMapping("/{number}")
	public ResponseEntity<Employee> getEmployeeByNumber(@PathVariable String number){
		return new ResponseEntity<Employee>(service.findByDetail(number), HttpStatus.OK);
	}
	
	
}
