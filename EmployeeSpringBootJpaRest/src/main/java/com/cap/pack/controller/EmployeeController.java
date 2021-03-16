package com.cap.pack.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cap.pack.entity.Employee;
import com.cap.pack.service.EmployeeServiceImpl;

@RestController
@RequestMapping("/Employee") // optional
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl service;
									  //url's
	@GetMapping("/getEmployee/{tid}") // http://localhost:5050/Employee/getEmployee/1
	public Optional<Employee> getEmployeeById(@PathVariable("tid") int EmployeeId) {
		return service.getEmployeeById(EmployeeId);
	}

	@PostMapping("/addEmployee") // http://localhost:5050/Employee/addEmployee
	public Employee addEmployee(@RequestBody Employee Employee) {
		return service.addEmployee(Employee);
	}

	@PutMapping("/updateEmployee/{tid}") // http://localhost:5050/Employee/updateEmployee/1
	public Employee updateEmployee(@RequestBody Employee Employee) {
		return service.updateEmployee(Employee);
	}

	@DeleteMapping("/deleteEmployee/{tid}") // http://localhost:5050/Employee/deleteEmployee/1
	public String deleteEmployee(@PathVariable("tid") int Employee) {
		service.removeEmployee(Employee);
		return "deleted successfully";
	}

	@GetMapping("/getAllEmployee") // http://localhost:5050/Employee/getAllEmployee
	public List<Employee> fetchAllEmployee() {
		return service.getAllEmployees();
	}
	
	@GetMapping("/getBatch") // http://localhost:5050/Employee/getBatch
	public List<Employee> batch(){
		return service.getBatch();
	}
	
	@GetMapping("/getId/{tid1}/{tid2}") // http://localhost:5050/Employee/getId/FirstNumber/SecondNumber
	public List<Employee> Id(@PathVariable("tid1") int sal1,@PathVariable("tid2") int sal2){
		return service.getId(sal1, sal2);
	}
	//swagger - http://localhost:5050/swagger-ui.html
}
