/**
 * 
 */
package com.cap.pack.service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.pack.entity.Employee;
import com.cap.pack.exception.GlobalException;
import com.cap.pack.repository.EmployeeDaoInterface;

/**
 * @author
 *
 */
@Service("service") // EmployeeServiceImpl service=new EmployeeServiceImpl()
@Transactional
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired
	EmployeeDaoInterface dao;

	public Employee addEmployee(Employee Employee) {
		return dao.save(Employee);
	}

	public Employee updateEmployee(Employee Employee) {
		return dao.save(Employee);
	}

	public void removeEmployee(int EmployeeId) {
		dao.deleteById(EmployeeId);
	}

	public Optional<Employee> getEmployeeById(int EmployeeId) {
		return dao.findById(EmployeeId);
	}

	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	public List<Employee> getBatch() {
		
		System.out.println("Enter the batch Name A or B");
		Scanner myObj = new Scanner(System.in);
		String batchName = myObj.nextLine();
		return dao.getBatch(batchName);			
	}

	@Override
	public List<Employee> getId(int i, int j) {
		if(i<1||j<1){
		throw new GlobalException("Enter valid Id's");
		}
		return dao.getId(i, j);
	}


}
