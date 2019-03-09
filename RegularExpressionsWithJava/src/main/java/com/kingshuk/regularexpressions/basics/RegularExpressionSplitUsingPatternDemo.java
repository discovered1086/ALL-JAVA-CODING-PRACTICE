package com.kingshuk.regularexpressions.basics;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularExpressionSplitUsingPatternDemo {

	public static void main(String[] args) {
		String targetString= "www.google.com";
		//Create the pattern
		//Pattern pattern = Pattern.compile("\\.");
		Pattern pattern = Pattern.compile("[.]");
		
		//Split the target string based on the occurrences of the pattern
		Arrays.asList(pattern.split(targetString)).forEach(System.out::println);
	}

}
