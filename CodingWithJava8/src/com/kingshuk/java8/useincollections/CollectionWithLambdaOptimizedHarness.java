package com.kingshuk.java8.useincollections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionWithLambdaOptimizedHarness {

	public static void main(String[] args) {
		List<Employee> employees = null;
		
		employees = Arrays.asList(new Employee(232649, "Kingshuk"),
				new Employee(457995, "Deeksha"),
				new Employee(12589, "Amit"));
		
		System.out.println("Before sorting: "+employees);
		
		//Sorting with the Comparable implementation
		Collections.sort(employees);
		
		System.out.println("After sorting using Comparable: "+employees);
		
		//Sorting with the Comparator implementation
		Collections.sort(employees, 
				(o1, o2) ->  
		        o1.getEmployeeId() >o2.getEmployeeId()?1:o1.getEmployeeId() <o2.getEmployeeId()?-1:0);
		
		System.out.println("After sorting in ascending order: "+employees);
		
		//Sorting with the Comparator implementation
		Collections.sort(employees, 
				(o1, o2) ->  
		o1.getEmployeeId() >o2.getEmployeeId()?-1:o1.getEmployeeId() <o2.getEmployeeId()?1:0);
		
		System.out.println("After sorting in descending order: "+employees);
	}

}
