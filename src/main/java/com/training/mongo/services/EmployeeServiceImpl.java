package com.training.mongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.mongo.collections.MyEmployee;
import com.training.mongo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	public List<MyEmployee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public MyEmployee getEmployeeDetails(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyEmployee getEmployeeById(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MyEmployee addEmployee(MyEmployee empDetails) {

		return employeeRepository.save(empDetails);
	}

}
