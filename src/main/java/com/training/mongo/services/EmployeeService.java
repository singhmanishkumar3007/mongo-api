package com.training.mongo.services;

import java.util.List;

import com.training.mongo.collections.MyEmployee;

public interface EmployeeService {

	List<MyEmployee> getAllEmployees();

	MyEmployee getEmployeeDetails(String userName);

	MyEmployee getEmployeeById(Long employeeId);

	MyEmployee addEmployee(MyEmployee empDetails);

}
