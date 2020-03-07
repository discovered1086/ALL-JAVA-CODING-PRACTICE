package com.kingshuk.javathelanguage.java8.optional.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class Person {

	private String name;
	private int age;

	private Address address;
}
