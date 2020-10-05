package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class ImmutabilityWithCollectors {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getUniqueNamePersonList();
		
		List<Integer> personsAgeList = personList.stream()
			.map(Person::getAge)
			.collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
		
		System.out.println(personsAgeList);
		System.out.println(personsAgeList.getClass());
		
		
		//Here's how we'll do it functionally
		Map<String, Integer> personNameAgeMap = personList.stream()
		.collect(Collectors.collectingAndThen(Collectors.toMap(Person::getName, Person::getAge),
				Collections::unmodifiableMap));
		
		System.out.println(personNameAgeMap);
	}

}