package com.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emp.model.Company;
import com.emp.model.Department;

public interface IDepartmentRepository extends JpaRepository<Department, Integer> {

}
