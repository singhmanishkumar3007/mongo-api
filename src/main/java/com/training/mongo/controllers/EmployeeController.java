package com.training.mongo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.mongo.collections.MyEmployee;
import com.training.mongo.services.EmployeeService;

@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	@GetMapping(value = "/allEmployees", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<MyEmployee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	@PostMapping(value = "/addEmployee", produces = MediaType.APPLICATION_JSON_VALUE)
	public MyEmployee addEmployee(@RequestBody MyEmployee empDetails) {
		return employeeService.addEmployee(empDetails);
	}

}
