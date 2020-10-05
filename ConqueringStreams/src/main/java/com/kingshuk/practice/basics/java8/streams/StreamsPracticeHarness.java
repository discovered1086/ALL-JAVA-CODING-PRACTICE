package com.kingshuk.practice.basics.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class StreamsPracticeHarness {


	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();

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
