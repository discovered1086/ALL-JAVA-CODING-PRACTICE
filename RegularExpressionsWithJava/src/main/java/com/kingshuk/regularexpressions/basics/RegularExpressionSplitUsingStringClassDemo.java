package com.kingshuk.regularexpressions.basics;

import java.util.Arrays;
import java.util.StringTokenizer;

public class RegularExpressionSplitUsingStringClassDemo {

	public static void main(String[] args) {
		String targetString= "www.google.com";
		
		//The String class split method takes the regular expression as arguement
		System.out.println("********Using String split method**************\n");
		//Split the target string based on the occurrences of the pattern
		Arrays.asList(targetString.split("[.]")).forEach(System.out::println);
		
		String targetString2 = "www.udemy.com";
		
		StringTokenizer tokenizer = new StringTokenizer(targetString2, "[.]");
		
		System.out.println("********Using String tokenizer**************\n");
		while(tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
	}

}
