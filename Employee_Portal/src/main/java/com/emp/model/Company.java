package com.emp.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name="COMPANY_DETAILS")
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@ToString
public class Company implements Serializable{
	@Id
	@GeneratedValue
	private Integer cid;
	@NonNull
	private String name;
	@NonNull
	private String location;
	
	@OneToMany(targetEntity = Department.class,cascade = CascadeType.ALL,mappedBy = "company")
	private List<Department> department;

}
