package com.kingshuk.enumpractice;

public class Employee {
	
	private int employeeId;
	
	private String employeeName;
	
	private EmployeeType employeeType;
	
	

	public Employee(int employeeId, String employeeName, EmployeeType employeeType) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeType="
				+ employeeType + "]";
	}
	
	

}
