package com.emp.model;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
@Table(name="EMP_INFORMAITON")
public class Employee implements Serializable {
	@Id
	@GeneratedValue(generator = "gen1",strategy = GenerationType.AUTO)
	private Integer eid;
	@NonNull
	@Column(length = 15)
	private String firstName;
	@NonNull
	@Column(length = 15)
	private String lastName;
	@NonNull
	@Column(length = 15)
	private String title;
	@NonNull
	@Column(length = 15)
	private String jobCode;
	@NonNull
	private Long bussinessPhoneNumber;
	@NonNull
	@Column(length = 15)
	private String compEmail;
	@NonNull
	@Column(length = 15)
	private String empId;
	@NonNull
	@Column(length = 15)
	private String location;
	@NonNull
	@Column(length = 15)
	private String hod;
	@NonNull
	private String workLevel;
	@NonNull
	@Column(length = 15)
	private String Manager;
	@Column(length = 15)
	@NonNull
	private String gender;
	@NonNull
	@ManyToOne(targetEntity = Department.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_dId",referencedColumnName = "dId")
	private Department depts;
	public Employee() {
		System.out.println("Employee.Employee()");
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", firstName=" + firstName + ", lastName=" + lastName + ", title=" + title
				+ ", jobCode=" + jobCode + ", bussinessPhoneNumber=" + bussinessPhoneNumber + ", compEmail=" + compEmail
				+ ", empId=" + empId + ", location=" + location + ", hod=" + hod + ", workLevel=" + workLevel
				+ ", Manager=" + Manager + ", gender=" + gender + "]";
	}
	
	
}
