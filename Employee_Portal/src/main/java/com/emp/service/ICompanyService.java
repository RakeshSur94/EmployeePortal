package com.emp.service;

import com.emp.model.Company;

public interface ICompanyService {
	public String registerComapany(Company company);
	public Company getCompanybyId(int id);

}
