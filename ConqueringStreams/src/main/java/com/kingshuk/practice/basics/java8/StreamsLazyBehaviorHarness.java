package com.kingshuk.practice.basics.java8;

import java.util.Arrays;
import java.util.List;

public class StreamsLazyBehaviorHarness {

	public static List<Person> getPersonList() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(String[] args) {
		List<Person> personList = getPersonList();

		//get the persons who are older than 25 and have 4 letters in their names
		System.out.println(
		personList.stream()
				.filter(StreamsLazyBehaviorHarness::is4LettersInName)
				.filter(StreamsLazyBehaviorHarness::is4OlderThan25)
				//.findFirst()
				);
	}
	
	public static boolean is4LettersInName(Person person) {
		System.out.println("Checking name for "+ person.getName());
		return person.getName().length() == 4;
	}
	
	
	public static boolean is4OlderThan25(Person person) {
		System.out.println("Checking age for "+ person.getName());
		return person.getAge() > 25;
	}

}
