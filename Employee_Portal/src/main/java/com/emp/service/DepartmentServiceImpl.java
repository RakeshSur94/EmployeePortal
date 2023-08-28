package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.exception.NotFoundException;
import com.emp.model.Department;
import com.emp.repository.IDepartmentRepository;
@Service("departmentService")
public class DepartmentServiceImpl implements IDepartmentService {
	@Autowired
	private IDepartmentRepository departmentRepository;

	@Override
	public String registerDepartment(Department department) {
		
		return "Department register With Id value "+departmentRepository.save(department).getDId();
	}

	@Override
	public Department getDepartmentById(int id) {
		
		return departmentRepository.findById(id).orElseThrow(() -> new NotFoundException("Invaild Dept Id"));
	}

}
