package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfMethodPractice {

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(10, 38, 788, 343, 9898, 1, 45, 392, 1009);
		
		System.out.println(
				integerList.stream().sorted().collect(Collectors.toList()));
		
		//Let's create a stream without the list
		
		Stream<Integer> integerStream = Stream.of(10, 47, 45, 67, 9897, 2, 48, 393, 1010);
		
		System.out.println(integerStream.sorted().collect(Collectors.toList()));
		
		Integer [] intArray = {11, 48, 46, 68, 9899, 5, 56, 3490, 1019};
		
		Stream<Integer> integerStream2 = Stream.of(intArray);
		
		System.out.println(integerStream2.sorted().collect(Collectors.toList()));
	}

}
