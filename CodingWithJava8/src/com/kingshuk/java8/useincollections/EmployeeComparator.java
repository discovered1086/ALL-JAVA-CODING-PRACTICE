package com.kingshuk.java8.useincollections;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeId() >o2.getEmployeeId()?1:o1.getEmployeeId() <o2.getEmployeeId()?-1:0;
	}

}
