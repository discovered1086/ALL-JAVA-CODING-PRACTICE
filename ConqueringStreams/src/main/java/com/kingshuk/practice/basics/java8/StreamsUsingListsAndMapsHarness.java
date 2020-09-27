package com.kingshuk.practice.basics.java8;

import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.*;

public class StreamsUsingListsAndMapsHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeHarness.getPersonList();

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
