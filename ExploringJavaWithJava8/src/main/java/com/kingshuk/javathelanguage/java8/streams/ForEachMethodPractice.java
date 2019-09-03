package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodPractice {

	public static void main(String[] args) {
		List<List<Integer>> integersList = 
				Arrays.asList(Arrays.asList(10, 38, 788, 343, 9898, 1, 45, 392, 1009),
				Arrays.asList(20, 45, 788, 378, 9760, 25, 92, 767, 7567));

		/*
		 * Here we have two lists of integers and we're going to find out the min and
		 * max values for each list
		 */

		integersList.stream().forEach(list -> {
			System.out.println(
					"The minimum value of this list is: " + 
							list.stream().min((i1, i2) -> i1.compareTo(i2)).get());
			
			System.out.println(
					"The maximum value of this list is: " + 
							list.stream().max((i1, i2) -> i1.compareTo(i2)).get());
		});
	}

}
