package com.emp.model;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Table(name="COMPANY_DETAILS")
@Getter
@Setter
@RequiredArgsConstructor

public class Company implements Serializable{
	@Id
	@GeneratedValue
	private Integer cid;
	@NonNull
	private String name;
	@NonNull
	private String location;
	
	public Company() {
		System.out.println("Company.Company()");
	}

	@Override
	public String toString() {
		return "Company [cid=" + cid + ", name=" + name + ", location=" + location + "]";
	}
	

}
