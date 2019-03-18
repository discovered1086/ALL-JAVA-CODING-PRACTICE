package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject;

public class PredicateEmployeeProjectHarness {

	public static void main(String[] args) {

		Employee employee = Employee.createInnerClass().createEmployee("Kingshuk Mukherjee", EmployeeLocation.CHENNAI,
				Designation.DEVELOPER, 65000.00);

		System.out.println("The employee object is:" + employee);
	}

}
