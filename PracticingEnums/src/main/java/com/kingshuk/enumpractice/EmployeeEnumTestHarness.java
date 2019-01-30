package com.kingshuk.enumpractice;

public class EmployeeEnumTestHarness {

	public static void main(String[] args) {
		Employee employee= new Employee(232649, "Kingshuk Mukherjee", EmployeeType.FULL_TIME_EMPLOYEE);
		
		System.out.println(employee);
		
		System.out.println(employee.getEmployeeType().getBatchNo());
	}

}
