package com.cap.pack.service;

import java.util.List;
import java.util.Optional;

import com.cap.pack.entity.Employee;

public interface EmployeeServiceInterface {

	Employee addEmployee(Employee Employee);

	Employee updateEmployee(Employee Employee);

	void removeEmployee(int EmployeeId);

	Optional<Employee> getEmployeeById(int EmployeeId);

	List<Employee> getAllEmployees();
	
	List<Employee> getBatch();
	
	List<Employee> getId(int i,int j);
}
