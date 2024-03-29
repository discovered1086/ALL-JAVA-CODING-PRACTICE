package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateEmployeeProjectHarness {

	public static void main(String[] args) {
		List<Employee> employeeList = null;

		Employee employee1 = Employee.createInnerClass().createEmployee("Kingshuk Mukherjee", EmployeeLocation.CHENNAI,
				Designation.DEVELOPER, 68000.00, "03/29/2010");
		Employee employee2 = Employee.createInnerClass().createEmployee("Deeksha Banerjee", EmployeeLocation.CHICAGO,
				Designation.MANAGER, 110000.00, "04/28/2010");
		Employee employee3 = Employee.createInnerClass().createEmployee("Amit Biswas", EmployeeLocation.CHENNAI,
				Designation.MANAGER, 120000.00, "03/19/2010");
		Employee employee4 = Employee.createInnerClass().createEmployee("Mayuri Srivastava", EmployeeLocation.KOLKATA,
				Designation.DEVELOPER, 75000.00, "03/29/2012");
		Employee employee5 = Employee.createInnerClass().createEmployee("Mainak Biswas", EmployeeLocation.BANGALORE,
				Designation.TESTER, 65000.00, "03/29/2018");

		employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);

		// System.out.println("The employee list is:" + employeeList);

		
		Predicate<Employee> selectManagers = employee -> employee.getDesignation().equals(Designation.MANAGER);

		Predicate<Employee> selectDevelopers = employee -> employee.getDesignation().equals(Designation.DEVELOPER);

		Predicate<Employee> selectSalary = employee -> employee.getSalary() < 70000.00;

		System.out.println("-------------Filtering managers from the list--------------");

		filterEmployees(selectManagers, employeeList);

		System.out.println("-------------Filtering managers from the list--------------\n\n");

		System.out.println("-------------Filtering developers from the list--------------");

		filterEmployees(selectDevelopers, employeeList);

		System.out.println("-------------Filtering developers from the list--------------\n\n");

		System.out.println("-------------Filtering developers who earn less than 70k from the list--------------");

		filterEmployees(selectDevelopers.and(selectSalary), employeeList);

		System.out.println("-------------Filtering developers who earn less than 70k from the list--------------\n\n");
	}

	public static void filterEmployees(Predicate<Employee> thePredicate, List<Employee> employeeList) {

		// Printing managers list without streams
		/*
		 * employeeList.forEach((emp) -> { if(selectManagers.test(emp)) {
		 * System.out.println("The managers in this project are: "+emp.getEmployeeName()
		 * ); } });
		 */

		// Printing managers list with streams
		List<Employee> filteredList = employeeList.stream().filter(thePredicate).collect(Collectors.toList());

		System.out.println("The selected employees are: ");

		filteredList.forEach(emp -> System.out.println(emp.getEmployeeName()));
	}

}
