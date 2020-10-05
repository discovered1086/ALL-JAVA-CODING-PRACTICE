package com.kingshuk.practice.basics.java8.streams;

import java.util.List;

import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class StreamsLazyBehaviorHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();

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
