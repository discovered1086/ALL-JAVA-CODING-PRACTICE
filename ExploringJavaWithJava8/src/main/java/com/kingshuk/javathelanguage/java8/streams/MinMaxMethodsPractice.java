package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinMaxMethodsPractice {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(10, 38, 788, 343, 9898, 1, 45, 392, 1009);

		Optional<Integer> min = integerList.stream().min((n1, n2) -> n1.compareTo(n2));

		Optional<Integer> max = integerList.stream().max((n1, n2) -> n1.compareTo(n2));

		System.out.println("The minimum value is: " + min.get());

		System.out.println("The maximum value is: " + max.get());
	}

}
