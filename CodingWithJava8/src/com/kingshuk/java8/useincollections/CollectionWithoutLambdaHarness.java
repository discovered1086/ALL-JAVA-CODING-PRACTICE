package com.kingshuk.java8.useincollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionWithoutLambdaHarness {

	public static void main(String[] args) {
		List<Employee> employees = null;
		
		employees = Arrays.asList(new Employee(232649, "Kingshuk"),
				new Employee(457995, "Deeksha"),
				new Employee(12589, "Amit"));
		
		System.out.println("Before sorting: "+employees);
		
		Collections.sort(employees, new EmployeeAscendingOrderComparator());
		
		System.out.println("After sorting in ascending order: "+employees);
		
		Collections.sort(employees, new EmployeeDescendingOrderComparator());
		
		System.out.println("After sorting in descending order: "+employees);
	}

}
