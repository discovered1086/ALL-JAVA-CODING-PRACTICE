package com.kingshuk.datastructures.sortingandcomparison;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithoutLambdaHarness {

	public static void main(String[] args) {
		/**
		 * Tree sets by default sort elements everytime we add elements
		 * 
		 * By default the sorting order is default or ascending order
		 * 
		 * But we'll see here how we can overturn that
		 */
		
		//Default sorting order will be preserved here
		Set<Employee> employeeSet = new TreeSet<>();
		employeeSet.add(new Employee(232649, "Kingshuk"));
		employeeSet.add(new Employee(457995, "Deeksha"));
		employeeSet.add(new Employee(12589, "Amit"));
		
		System.out.println("Default sorting order of tree set (ascending order) \n"+employeeSet);
	}

}
