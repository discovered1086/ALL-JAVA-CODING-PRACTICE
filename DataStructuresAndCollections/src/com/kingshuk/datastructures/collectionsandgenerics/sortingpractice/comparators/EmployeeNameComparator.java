package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<String> {

	@Override
	public int compare(String employeeName1, String employeeName2) {
		return Math.negateExact(employeeName2.compareTo(employeeName1));
	}

}
