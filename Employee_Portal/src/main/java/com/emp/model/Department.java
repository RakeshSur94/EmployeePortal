package com.emp.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@RequiredArgsConstructor
@Table(name="EMP_DEPARTMENT")

public class Department implements Serializable{
	@Id
	private Integer dId;
	@NonNull
	private String dName;
	@NonNull
	@ManyToOne(targetEntity = Company.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_cid",referencedColumnName = "cId")
	private Company company;
	public Department() {
		System.out.println("Department.Department()");
	}
	@Override
	public String toString() {
		return "Department [dId=" + dId + ", dName=" + dName + "]";
	}
	

}
