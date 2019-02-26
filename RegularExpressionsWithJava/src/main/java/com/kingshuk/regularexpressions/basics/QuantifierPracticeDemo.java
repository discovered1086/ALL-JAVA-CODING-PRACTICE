package com.kingshuk.regularexpressions.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierPracticeDemo {

	public static void main(String[] args) {
		
		//This means at least one @
		String regularExpression1 = "@+";
		
		//This means any number of @ including zero
		String regularExpression2 = "@*";
		
		//This means at most one @ including zero
		String regularExpression3 = "@?";
		
		//This means exactly one @
		String regularExpression4="@";
		
		//String regularExpression2 = "[.+]";
		
		//A valid email address
		String targetString1= "sly.mania42@gmail.com";
		
		//An invalid email address
		String targetString2 = "sly.mania42";
		
		String targetString3 = "sly.mania42@@@";
		
		Pattern pattern = Pattern.compile(regularExpression4);
		
		Matcher matcher =  pattern.matcher(targetString3);
		
		boolean isEmailValid = false;
		
		while(matcher.find()) {
			System.out.println("The start: "+matcher.start()+" The group: "+matcher.group());
			isEmailValid = true;
		}
		
		System.out.println("Is this is a valid email address? "+isEmailValid);
		
	}
	

}
