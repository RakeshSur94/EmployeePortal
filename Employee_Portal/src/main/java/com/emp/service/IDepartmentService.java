package com.emp.service;

import com.emp.model.Department;

public interface IDepartmentService {
	public String registerDepartment(Department department);
	public Department getDepartmentById(int id);

}
