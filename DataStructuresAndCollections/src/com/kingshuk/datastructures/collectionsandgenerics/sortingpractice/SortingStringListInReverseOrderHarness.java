package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringListInReverseOrderHarness {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Kingshuk", "Amit", "Deeksha", "Mayuri");
		
		System.out.println("Before sorting: \n"+nameList);
		
		Collections.sort(nameList);
		
		System.out.println("After sorting in natural(ascending) order: \n"+nameList);
		
		Collections.reverse(nameList);
		
		System.out.println("After sorting in descending order: \n"+nameList);
	}

}
