package com.synerzip.employee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column(name="emp_id")
	int empId;
	@Column(name="emp_name")
	String empName;
	@Column(name="emp_department")
	String empDepartment;
	@Column(name="emp_subject")
	String empSubjects;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDepartment() {
		return empDepartment;
	}

	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}

	public String getEmpSubjects() {
		return empSubjects;
	}

	public void setEmpSubjects(String empSubjects) {
		this.empSubjects = empSubjects;
	}

	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment
				+ ", empSubjects=" + empSubjects + "]";
	}
}
