package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountNumberOfSpacesInStringTest {

	public static void main(String[] args) {
		String targetString = "My name is Kingshuk Mukherjee and I work at discover";

		Function<String, Integer> countSpaceFunction = s -> {
			int count = 0;

			Pattern pattern = Pattern.compile(" ");

			Matcher matcher = pattern.matcher(s);

			while (matcher.find()) {
				count++;
			}
			return count;
		};

		System.out.println("Number of spaces in the string is: " + countSpaceFunction.apply(targetString));
	}

}
