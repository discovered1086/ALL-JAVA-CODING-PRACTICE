package com.kingshuk.practice.basics.java8.streams.util;

import java.util.Arrays;
import java.util.List;

import com.kingshuk.practice.basics.java8.streams.Gender;
import com.kingshuk.practice.basics.java8.streams.Person;

public final class StreamsPracticeUtil {

	private StreamsPracticeUtil() {

	}

	public static List<Person> getPersonList() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}
	
	public static List<Person> getUniqueNamePersonList() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Claire", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jimmy", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12));
	}

	public static List<Person> getExpandedList() {
		return Arrays.asList(new Person("Sara", Gender.FEMALE, 20), new Person("Sara", Gender.FEMALE, 22),
				new Person("Bob", Gender.MALE, 20), new Person("Paula", Gender.FEMALE, 32),
				new Person("Paul", Gender.MALE, 32), new Person("Jack", Gender.MALE, 2),
				new Person("Jack", Gender.MALE, 72), new Person("Jill", Gender.FEMALE, 12),
				new Person("Mahi", Gender.FEMALE, 11), new Person("Natalie", Gender.FEMALE, 3));
	}

}
