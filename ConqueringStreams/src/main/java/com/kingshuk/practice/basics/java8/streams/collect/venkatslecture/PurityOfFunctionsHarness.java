package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class PurityOfFunctionsHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();

		// get the list of names in upper case of
		// those who are older than 30

//		List<String> listOfNames = new ArrayList<>();
//		
//		personList.stream()
//			.filter(person -> person.getAge() > 30)
//			.map(Person::getName)
//			.map(String::toUpperCase)
//			.forEach(listOfNames::add);
//
//		List<String> listOfNames = personList.parallelStream()
//				.filter(person -> person.getAge() > 30).map(Person::getName)
//				.map(String::toUpperCase).reduce(new ArrayList<String>(), // The initial value of reduce operation
//						(names, name) -> {
//							names.add(name);
//							return names;
//						}, (names1, names2) -> {
//							names1.addAll(names2);
//							return names1;
//						});
//
//		listOfNames.forEach(System.out::println);
		
		
		personList.parallelStream()
			.filter(person -> person.getAge() > 30)
			.map(Person::getName)
			.map(String::toUpperCase)
			.collect(Collectors.toList())
			.forEach(System.out::println);
	}

}
