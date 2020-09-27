package com.kingshuk.practice.basics.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPracticeHarness {

	public static List<Person> getPersonList() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static void main(String[] args) {
		List<Person> personList = getPersonList();

//		//Get the names of all females older than 18 years
		List<Person> feamleOlderThan18 = personList.stream().filter(person -> Gender.FEMALE.equals(person.getGender()) && person.getAge() > 18)
				.map(person ->new Person(person.getName().toUpperCase(), person.getGender(), person.getAge()))
		.collect(Collectors.toList());

		// Get the names of all females older than 18 years
		List<String> feamleOlderThan18names = personList.stream()
				.filter(person -> Gender.FEMALE.equals(person.getGender()) && person.getAge() > 18).map(Person::getName)
				.map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(feamleOlderThan18);
		
		System.out.println(feamleOlderThan18names);
		
		System.out.println(personList);
		
		
		personList.stream().filter(person -> Gender.MALE.equals(person.getGender()))
				.forEach(System.out::println);
	}

}
