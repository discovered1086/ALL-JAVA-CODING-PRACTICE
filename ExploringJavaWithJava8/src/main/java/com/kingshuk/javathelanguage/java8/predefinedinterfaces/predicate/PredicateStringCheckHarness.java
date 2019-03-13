package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateStringCheckHarness {

	public static void main(String[] args) {
		Predicate<String> lengthCheck =  s -> s.length()>10;
		
		String stringValue = "Kingshuk Mukherjee";
		
		System.out.println("Is the length of "+stringValue + " greater than 10?"+lengthCheck.test(stringValue));
	}

}
