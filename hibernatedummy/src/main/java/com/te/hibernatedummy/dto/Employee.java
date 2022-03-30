package com.te.hibernatedummy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employee_details")
public class Employee {
	@Id
	@Column(name = "emp_id")
	public Integer empId;

	@Column(name = "emp_name")
	public String empName;

	@Column(name = "emp_address")
	public String empAddress;

	@Column(name = "emp_password")
	public String empPassword;
}
