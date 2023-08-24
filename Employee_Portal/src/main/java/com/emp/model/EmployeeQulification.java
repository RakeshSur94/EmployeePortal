package com.emp.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@RequiredArgsConstructor
@Table(name="EMP_PREVIOUSINFORMAITON")
public class EmployeeQulification implements Serializable {

	@Id
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer qId;
	@NonNull
	private LocalDate startDate;
	@NonNull
	private LocalDate endDate;
	@NonNull
	@Column(length = 25)
	private String  preCompanyName;
	@Column(length = 25)
	private String title; 
	@NonNull
	@ManyToOne(targetEntity = Employee.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_Qid",referencedColumnName = "eid")
	private Employee empQs;
	
	public EmployeeQulification() {
		System.out.println("EmployeeQulification.EmployeeQulification()");
	}

	@Override
	public String toString() {
		return "EmployeeQulification [qId=" + qId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", preCompanyName=" + preCompanyName + ", title=" + title + "]";
	}
	
	
	
}
