package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.sortingtreemap;

import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.Employee;

public class TreeMapSortingHarness {

	public static void main(String[] args) {
		Map<String, Employee> employeeMap = new TreeMap<>();

		Employee employee = new Employee(232649, "Kingshuk");
		Employee employee2 = new Employee(65656, "Deeksha");
		Employee employee3 = new Employee(1326565, "Amit");
		Employee employee4 = new Employee(87956, "Mayuri");

		employeeMap.put(employee.getEmployeeName(), employee);
		employeeMap.put(employee2.getEmployeeName(), employee2);
		employeeMap.put(employee3.getEmployeeName(), employee3);
		employeeMap.put(employee4.getEmployeeName(), employee4);

		System.out.println("The map in default sorting order: \n" + employeeMap);

		// The first way to sort the tree map in descending order
		Map<String, Employee> employeeMap2 = new TreeMap<>();

		employeeMap2.put(employee.getEmployeeName(), employee);
		employeeMap2.put(employee2.getEmployeeName(), employee2);
		employeeMap2.put(employee3.getEmployeeName(), employee3);
		employeeMap2.put(employee4.getEmployeeName(), employee4);

		NavigableMap<String, Employee> navigableMap = ((TreeMap<String, Employee>) employeeMap2).descendingMap();

		System.out.println("The map in descending sorting order: \n" + navigableMap);

		// The second way of sorting the tree map in descending order
		Map<String, Employee> employeeMap3 = new TreeMap<>(Collections.reverseOrder());

		employeeMap3.put(employee.getEmployeeName(), employee);
		employeeMap3.put(employee2.getEmployeeName(), employee2);
		employeeMap3.put(employee3.getEmployeeName(), employee3);
		employeeMap3.put(employee4.getEmployeeName(), employee4);

		System.out.println("The map in descending sorting order: \n" + employeeMap3);

		/*
		 * Here another way of doing that is by passing a comparator expression or
		 * lambda expression ofin the constructor of the tree map
		 */

	}

}
