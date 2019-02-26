package com.kingshuk.javathelanguage.java8.useincollections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithLambdaHarness {

	public static void main(String[] args) {
		/**
		 * Tree sets by default sort elements everytime we add elements
		 * 
		 * By default the sorting order is default or ascending order.
		 * 
		 * But if it a user-defined class the class MUST implement Comparable,
		 * if the default sorting order has to work, otherwise the JVM does NOT
		 * know what is basis of sorting these user-defined objects.
		 * 
		 * Here we have implemented the Comparable interface in Employee Object
		 * in such a way that the natural order is descending order
		 * 
		 * But we'll see here how we can overturn that
		 */
		
		//Default sorting order will be preserved here
		Set<Employee> employeeSet = new TreeSet<>();
		employeeSet.add(new Employee(232649, "Kingshuk"));
		employeeSet.add(new Employee(457995, "Deeksha"));
		employeeSet.add(new Employee(12589, "Amit"));
		
		System.out.println("Default sorting order of tree set (Descendiing order) \n"+employeeSet);
		
		/**
		 * Now we're going to overturn that and this is the only way to overturn this
		 * in a set. We can't use Collections.sort() like we do for lists
		 */
		Set<Employee> employeeSet2 = new TreeSet<>(
			(employee1, employee2)-> employee1.getEmployeeId()>employee2.getEmployeeId()?1
					:employee1.getEmployeeId()<employee2.getEmployeeId()?-1:0
				);
		employeeSet2.add(new Employee(232649, "Kingshuk"));
		employeeSet2.add(new Employee(457995, "Deeksha"));
		employeeSet2.add(new Employee(12589, "Amit"));
		
		System.out.println("Custom sorting order of tree set (ascending order) \n"+employeeSet2);
		
	}

}
