package com.telefonica.jee.dao;

import java.util.List;

import com.telefonica.jee.model.Employee;

/**
 * DAO for employee operations
 * @author alan.sastre
 */
public interface EmployeeDAO {
	
	/**
	 * It returns a list of all employees
	 * @return
	 */
	List<Employee> get();
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	Employee get(int id);
	
	/**
	 * It sves an Employee
	 * @param employee
	 * @return true if employee is correctly saved or false if there is an error
	 */
	boolean save(Employee employee);
	
	/**
	 * 
	 * @param id
	 * @return 
	 */
	boolean delete(int id);
	
	boolean update(Employee employee);
}
