package com.kingshuk.practice.basics.java8;

import java.util.List;

public class StreamsCountHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeHarness.getPersonList();

		// Count all the non-adults
		long count = personList.stream().filter(person -> person.getAge() < 18).count();

		System.out.println("The number of non-adults is: " + count);
	}

}
