package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JoiningWithCollectors {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getUniqueNamePersonList();

		//Create comma separated names in upper case of people older than 30
		String commaSeparatedNames = personList.stream().filter(person -> person.getAge() > 30)
				.map(Person::getName)
				.map(String::toUpperCase)
				.collect(Collectors.joining(","));

		System.out.println(commaSeparatedNames);
	}

}