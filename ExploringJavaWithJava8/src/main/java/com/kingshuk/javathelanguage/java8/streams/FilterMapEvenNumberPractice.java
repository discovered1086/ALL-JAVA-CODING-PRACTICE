package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapEvenNumberPractice {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(0, 10, 20, 5, 15, 25);

		System.out.println(integerList);

		List<Integer> filteredIntegers = integerList.stream().filter(number -> (number % 2 == 0))
				.collect(Collectors.toList());

		System.out.println("Even numbers are: " + filteredIntegers);

		List<Integer> mappedIntegers = 
				integerList.stream().map(number -> (number % 2 != 0) ? number * 5 : number
		).collect(Collectors.toList());

		System.out.println(mappedIntegers);
	}

}
