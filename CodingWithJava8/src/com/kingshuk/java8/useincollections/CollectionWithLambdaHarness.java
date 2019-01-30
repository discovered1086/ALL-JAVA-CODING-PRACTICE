package com.kingshuk.java8.useincollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionWithLambdaHarness {

	public static void main(String[] args) {
		List<Employee> employees = null;
		
		employees = Arrays.asList(new Employee(232649, "Kingshuk"),
				new Employee(457995, "Deeksha"),
				new Employee(12589, "Amit"));
		
		System.out.println("Before sorting: "+employees);
		
		Comparator<Employee> employeeComparator = 
				(o1, o2) -> o1.getEmployeeId() >o2.getEmployeeId()?1:o1.getEmployeeId() <o2.getEmployeeId()?-1:0;
		
		Collections.sort(employees, employeeComparator);
		
		System.out.println("After sorting: "+employees);
	}

}
