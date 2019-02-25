package com.kingshuk.regularexpressions.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PreDefinedCharacterClassDemo {

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
		
		//I want to search all special characters and spaces
		String regularExpression1 = "[\\W \\s]";
		
		//I want to search all special characters that does not include space
		String regularExpression2 = "[^\\s \\w]";
		
		//I want to search all non digit characters
		String regularExpression3 = "[\\D]";
		
		//I want to search all numeric characters
		String regularExpression4 = "[\\d]";
		
		//I want to search all non space characters
		String regularExpression5 = "[\\S]";
		
		Pattern pattern = Pattern.compile(regularExpression4);
		
		Matcher matcher =  pattern.matcher("sly.mania42  @gmail.com");
		
		while (matcher.find()) {
			
			//I only want to know what  special character is found
			System.out.println("The special character is: "+matcher.group()+" at index: "+matcher.start());
		}
	}
	

}
