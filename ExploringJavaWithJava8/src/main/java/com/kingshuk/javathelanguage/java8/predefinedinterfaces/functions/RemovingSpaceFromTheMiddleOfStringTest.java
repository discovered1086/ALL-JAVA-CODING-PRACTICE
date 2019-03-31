package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemovingSpaceFromTheMiddleOfStringTest {

	public static void main(String[] args) {
		String targetString = "My name is Kingshuk Mukherjee";
		
		Function<String, String> removeStringFunction = s->{
			Pattern pattern = Pattern.compile(" ");
			
			Matcher matcher = pattern.matcher(s);
			
			return matcher.replaceAll("");
		};
		
		System.out.println("Before removing spaces "+targetString+" and length is: "+targetString.length());
		
		targetString = removeStringFunction.apply(targetString);
		
		System.out.println("After removing spaces "+targetString+" and length is: "+targetString.length());
	}

}
