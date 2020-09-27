package com.kingshuk.practice.basics.java8;

import java.util.List;

public class StreamsReduceHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeHarness.getPersonList();
		
		//Summing all person's ages
		Integer sumOfAllAges = personList.stream()
			.map(Person::getAge)
			.reduce(0, (carry, age) -> carry + age);
		
		//Summing all person's ages
		Integer sumOfAllAges2 = personList.stream()
					.map(Person::getAge)
					.reduce(0, Integer::sum);
		
		//Summing all person's ages
		int sumOfAllAges3 = personList.stream()
					.mapToInt(Person::getAge)
					.sum();
		
		System.out.println("Sum using reduce method: "+sumOfAllAges);
		
		System.out.println("Sum using Integer's sum method: "+sumOfAllAges2);
		
		System.out.println("Sum using Stream's sum method: "+sumOfAllAges3);
	}

}
