package com.aprentiship_cell.service;

import com.aprentiship_cell.entity.Employee;

import java.util.List;

public interface EmployeeService {

	public void addEmployee(Employee emp);
	
	public void editEmployee(Employee emp);
	
	public void editEmployee(int id);
	
	public List<Employee> fetchEmployee();
}
