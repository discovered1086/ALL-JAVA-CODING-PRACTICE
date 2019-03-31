package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.Function;

public class RemovingSpaceFromStringTest {

	public static void main(String[] args) {
		String targetString = "    My name is Kingshuk Mukherjee    ";
		
		Function<String, String> removeStringFunction = s -> s.trim();
		
		System.out.println("Before removing spaces "+targetString+" and length is: "+targetString.length());
		
		targetString = removeStringFunction.apply(targetString);
		
		System.out.println("After removing spaces "+targetString+" and length is: "+targetString.length());
	}

}
