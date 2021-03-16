package com.cap.pack.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cap.pack.entity.Employee;

@Repository
public interface EmployeeDaoInterface extends JpaRepository<Employee, Integer> {
	 @Query("SELECT a FROM Employee a WHERE employee_batch = ?1")
	    List<Employee>  getBatch(String String);
	 @Query("SELECT a FROM Employee a WHERE employee_id BETWEEN ?1 AND ?2")
	    List<Employee>  getId(int i, int j);
}