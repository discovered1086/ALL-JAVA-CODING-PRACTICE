package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.List;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateJoinListExample {
	
	public static void main(String[] args) {
		
		Predicate<Collection<String>> checkEmptyCollection = Collection::isEmpty;
		
		Predicate<Collection<String>> checkForExistence = list->list.contains("Kingshuk");
		
		List<String> namesList = Arrays.asList("Kingshuk","Deeksha");
		
		Predicate<Collection<String>> combinedPredicate = checkEmptyCollection.negate().and(checkForExistence);
		
		System.out.println("Does the list have the value I need? "+combinedPredicate.test(namesList));
	}

}
