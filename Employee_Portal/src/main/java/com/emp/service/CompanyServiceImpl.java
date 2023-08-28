package com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.exception.NotFoundException;
import com.emp.model.Company;
import com.emp.repository.ICompanyRepository;
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {
	@Autowired
	private ICompanyRepository companyRepo;

	@Override
	public String registerComapany(Company company) {
		int companyId=companyRepo.save(company).getCid();
		return "Company Register with Id "+companyId;
	}

	@Override
	public Company getCompanybyId(int id) {
		return companyRepo.findById(id).orElseThrow(()->new NotFoundException("Invalid ID"));
	}

}
