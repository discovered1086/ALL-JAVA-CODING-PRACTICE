package com.kingshuk.regularexpressions.basics;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicRegularExpressionDemo {

	public static void main(String[] args) {
		int count = 0;

		// Defining the pattern
		Pattern pattern = Pattern.compile("ab");

		// Defining which string this pattern should be applied to
		//The string passed to the matcher method is also known as the target string.
		Matcher matcher = pattern.matcher("ahshdhssdjdhjabbbabababa");

		while (matcher.find()) {
			count++;

			//The matcher.end() method has been implemented to return the end index+1 value
			
			//Here matcher.group tells us which pattern got a match in the target string we have passed.

			System.out.println(matcher.start() + "..." + matcher.end() + "...." + matcher.group());
		}
		
		System.out.println("The number of occurences..."+count);
	}

}
