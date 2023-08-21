package com.emp.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="EMP_INFORMAITON")
public class Employee implements Serializable{
	@Id
	@GeneratedValue
	private Integer userName;
	private String firstName;
	private String lastName;
	private String title;
	private String jobCode;
	private Long bussinessPhoneNumber;
	private String businessFax;
	private String compEmail;
	private String empId;
	private String vertical;
	private String function;
	private String subFunction;
	private String department;
	private String location;
	private String bloodGroup;
	private String hod;
	private String functionalHead;
	private String workLevel;
	private String Manager;
	private String gender;
	
	

}
