package com.emp.service;

import java.util.List;

import com.emp.model.Employee;

public interface IEmployeeSerivice {
	public String registerEmployee(Employee emp);
	public List<Employee> getAllEmployee();
	public Employee fetchEmployeeById(int id);
	public String updateEmployee(Employee emp);
	public String deleteEmpoyeeById(int id);

}
