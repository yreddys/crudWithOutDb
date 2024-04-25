package com.crud.entity;

public class Employee {
	private int empId;
	private String empName;

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

	public Employee(int empId, String empName) {

		this.empId = empId;
		this.empName = empName;
	}

	public Employee() {
	}
}
