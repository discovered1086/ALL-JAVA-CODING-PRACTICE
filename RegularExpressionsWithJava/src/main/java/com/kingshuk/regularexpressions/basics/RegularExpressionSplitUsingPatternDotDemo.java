package com.kingshuk.regularexpressions.basics;

import java.util.Arrays;
import java.util.regex.Pattern;

public class RegularExpressionSplitUsingPatternDotDemo {

	public static void main(String[] args) {
		String targetString= "Match and find the regular expression in the target string.";
		//Create the pattern
		Pattern pattern = Pattern.compile("\\s");
		
		//Split the target string based on the occurrences of the pattern
		Arrays.asList(pattern.split(targetString)).forEach(System.out::println);
	}

}
