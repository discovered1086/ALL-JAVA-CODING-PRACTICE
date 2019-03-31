package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.Function;

public class CountNumberOfSpacesInStringEasierOptionTest {

	public static void main(String[] args) {
		String targetString = "My name is Kingshuk Mukherjee and I work at discover";

		Function<String, Integer> countSpaceFunction = s -> s.length() - s.replaceAll(" ", "").length();

		System.out.println("Number of spaces in the string is: " + countSpaceFunction.apply(targetString));
	}

}
