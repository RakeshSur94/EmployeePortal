package com.emp.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="EMP_EDUCATION")
public class EmployeeEducation implements Serializable {
	private Integer id;
	private LocalDate startDate;
	private LocalDate endDate;
	private String institution;
	private String degree;
	private String major;
	private String type;
	private String rank;

}
