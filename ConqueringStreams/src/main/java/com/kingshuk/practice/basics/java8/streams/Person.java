package com.kingshuk.practice.basics.java8.streams;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class Person {

	private String name;

	private Gender gender;

	private int age;

	@Override
	public String toString() {
		return String.format("%s -- %s -- %d", name, gender, age);
	}

}
