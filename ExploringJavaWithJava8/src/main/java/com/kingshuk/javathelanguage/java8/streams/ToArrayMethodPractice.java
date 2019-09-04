package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;

public class ToArrayMethodPractice {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(10, 38, 788, 343, 9898, 1, 45, 392, 1009);
		
		Integer [] intArray = integerList.stream().sorted().toArray(Integer []::new);
		
		//Since arrays don't have in-built toString() implementations
		//We'll have to print each element.
		
		for (Integer integer : intArray) {
			System.out.println(integer);
		}
	}

}
