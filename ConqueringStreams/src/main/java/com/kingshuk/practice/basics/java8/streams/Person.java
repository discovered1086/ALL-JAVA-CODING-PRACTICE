package com.kingshuk.practice.basics.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person {

	private final String name;

	private final Gender gender;

	private final int age;

	@Override
	public String toString() {
		return String.format("%s -- %s -- %d", name, gender, age);
	}

}
