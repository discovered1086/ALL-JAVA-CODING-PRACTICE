package com.kingshuk.datastructures.sortingandcomparison;

import java.util.Comparator;

public class EmployeeDescendingOrderComparator implements Comparator<Employee> {

	/**
	 * Here what we're essentially saying in the method is that
	 * 
	 * I'm trying to order the employees in descending order of their employee
	 * ids. This is a critical decision that should be taken before we even
	 * start writing our comparator class or lambda expression
	 * 
	 * 1) So if o1's employee id is bigger than o2's employee id then o1 should
	 * come first, and we know that "before means negative" that's why we're returning
	 * a negative integer value
	 * 
	 * 2) If o1's employee id is smaller than o2's employee id then o1 should come later
	 * (because this class sorts based on descending order of employee ids) and we know 
	 * "later or after means positive" that's why we're returning a positive integer value
	 * 
	 * 3) And of course 0 if they're equal
	 */
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getEmployeeId()>o2.getEmployeeId()?-1:
				o1.getEmployeeId()<o2.getEmployeeId()?1:0;
	}

	

}
