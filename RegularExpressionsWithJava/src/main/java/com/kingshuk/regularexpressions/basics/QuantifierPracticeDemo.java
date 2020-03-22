package com.kingshuk.regularexpressions.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierPracticeDemo {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		/*
		 * This means if at least one @ is present,
		 * it is considered as  part of a single match
		 */
		String regularExpression1 = "@+";
		
		/*
		 * This means any number of @ including zero
		 * is  considered as part of a single match
		 * 
		 */
		String regularExpression2 = "@*";
		
		/*
		 * This means at most one @ including zero
		 * is considered to be part of a single match
		 */
		String regularExpression3 = "@?";
		
		/*
		 * This means exactly one @ is
		 * considered to be part of a single match
		 */
		String regularExpression4="@";
		
		
		//A valid email address
		String targetString1= "sly.mania42@gmail.com";
		
		//An invalid email address
		//String targetString2 = "sly.mania42";
		
		String targetString3 = "sly.mania42@@@";
		
		Pattern pattern = Pattern.compile(regularExpression3);
		
		Matcher matcher =  pattern.matcher(targetString3);
		
		boolean isEmailValid = false;
		
		System.out.println("The length of the target string is: "+targetString3.length());
		
		while(matcher.find()) {
			System.out.println("The start: "+matcher.start()+" The group: "+matcher.group());
			isEmailValid = true;
		}
		
		System.out.println("Is this is a valid email address? "+isEmailValid);
		
	}
	

}
