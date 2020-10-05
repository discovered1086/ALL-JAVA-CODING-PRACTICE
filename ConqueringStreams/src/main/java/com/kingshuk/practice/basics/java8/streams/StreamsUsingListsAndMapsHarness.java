package com.kingshuk.practice.basics.java8.streams;

import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class StreamsUsingListsAndMapsHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();

		//Give me the names of all males
		Set<String> namesList = personList.stream()
						.filter(person -> Gender.MALE.equals(person.getGender()))
						.map(Person::getName)
						.collect(toSet());
		
		System.out.println(namesList);
		
		//Collecting a map of the person and the key is the name of the person
		Map<String, Person> map = personList.stream()
					.filter(person -> Gender.MALE.equals(person.getGender()))
					.collect(toMap(
							person -> person.getName() + "--" +person.getAge(),
							person -> person
							));
		
		System.out.println(map);
		
	}

}
