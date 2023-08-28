package com.emp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.exception.NotFoundException;
import com.emp.model.Employee;
import com.emp.repository.IEmployeeRepository;
@Service("employeeService")
public class EmployeeServiceImpl implements IEmployeeSerivice {
	@Autowired
	private IEmployeeRepository empRepository;

	@Override
	public String registerEmployee(Employee emp) {
		int registerEmpId=empRepository.save(emp).getEid();
		return "Employee register with Id "+registerEmpId;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empRepository.findAll();
	}

	@Override
	public Employee fetchEmployeeById(int id) {
	Optional<Employee>opt=empRepository.findById(id);
	if(opt.isPresent()) {
           return opt.get();
	}
	else {
		throw new NotFoundException("Employee Not found");
	}
		
	}

	@Override
	public String updateEmployee(Employee emp) {
	
		return "Employee updated with id "+empRepository.save(emp).getEid();
	}

	@Override
	public String deleteEmpoyeeById(int id) {
		Optional<Employee> opt=empRepository.findById(id);
		if(opt.isPresent()) {
			empRepository.deleteById(id);
		}
			return "Employee not found";
						
	}

}
