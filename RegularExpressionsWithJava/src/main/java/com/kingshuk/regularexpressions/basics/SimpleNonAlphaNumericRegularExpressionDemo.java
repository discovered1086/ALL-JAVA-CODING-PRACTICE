package com.kingshuk.regularexpressions.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleNonAlphaNumericRegularExpressionDemo {

	public static void main(String[] args) {
		/*
		 * Define the regular expression
		 * 
		 * The regular expression is that we're searching for special characters
		 * 
		 * Basically the below regular expression says,
		 * 
		 * The pattern should look for anything that's
		 * 	1) Not a number
		 *  2) Not an  upper case or lower case alphabet
		 */
		
		String regularExpression = "[^a-z A-Z 0-9]";
		
		Pattern pattern = Pattern.compile(regularExpression);
		
		Matcher matcher =  pattern.matcher("sly.mania42@gmail.com");
		
		while (matcher.find()) {
			
			//I only want to know what  special character is found
			System.out.println("The special character is: "+matcher.group());
		}
	}

}
