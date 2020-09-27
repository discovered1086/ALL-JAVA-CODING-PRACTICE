package com.kingshuk.practice.basics.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsProperLandingHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeHarness.getPersonList();

		//Give me the names of all adults
		List<String> namesList = new ArrayList<>();
		
		personList.stream()
				.filter(person -> person.getAge() >=18)
				.map(person -> person.getName().toUpperCase())
				.forEach(namesList::add);
		
		System.out.println(namesList);
		
		List<String> namesList2 = personList.stream()
				.filter(person -> person.getAge() >=18)
				.map(person -> person.getName().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println(namesList2);
		
		
		List<String> namesList3 = personList.stream()
				.filter(person -> person.getAge() >=18)
				.map(person -> person.getName().toUpperCase())
				.collect(
						ArrayList::new,
						(list, name) -> list.add(name),
						(list1, list2) -> list1.addAll(list2));
		
		System.out.println(namesList3);
		
	}

}
