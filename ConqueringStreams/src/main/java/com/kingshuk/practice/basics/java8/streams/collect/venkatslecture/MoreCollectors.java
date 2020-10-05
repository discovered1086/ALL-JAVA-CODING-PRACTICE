package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class MoreCollectors {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();
		
//		personList.stream()
//			.filter(person -> person.getAge() >30)
//			.collect(Collectors.toList())
//			.forEach(System.out::println);
		
		
		//what if I want to have map with name as key and age as value
		//Imperatively this would look something like this
		Map<String, Integer> nameAndAge = new HashMap<>();
		
		for (Person person: personList) {
			nameAndAge.put(person.getName(), person.getAge());
		}
		
		System.out.println(nameAndAge);
		
		//Here's how we'll do it functionally
		Map<String, Integer> personNameAgeMap = personList.stream()
		.collect(Collectors.toMap(Person::getName, Person::getAge));
		
		System.out.println(personNameAgeMap);
	}

}
