package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateIsEqualTestHarness {

	public static void main(String[] args) {
		
		/*
		 * We could have easily written something like this
		 * 
		 * Predicate<String> equalStringCheck1 = s -> s.equals("Kingshuk");
		 * 
		 * But when it's about checking object equality, there's another way of
		 * doing this
		 */
		
		/*
		 * So here the predicate represents the string Kingshuk and 
		 * When the test method is called on this predicate
		 * it basically means we're trying to ascertain if something is equal to
		 * the string Kingshuk or not
		 */
		Predicate<String> equalStringCheck = Predicate.isEqual("Kingshuk");
		
		List<String> namesList = Arrays.asList("Kingshuk", "Deeksha");
		
		namesList.stream()
				 .filter(equalStringCheck)
				 .collect(Collectors.toList())
				 .forEach(System.out::println);
	}

}
