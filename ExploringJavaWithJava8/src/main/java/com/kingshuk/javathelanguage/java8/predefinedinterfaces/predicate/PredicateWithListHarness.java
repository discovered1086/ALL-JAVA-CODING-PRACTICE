package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateWithListHarness {

	public static void main(String[] args) {
		Predicate<Collection<String>> checkifCollectionIsEmpty = Collection::isEmpty;
		
		List<String> namesList = Arrays.asList("Kingshuk", "Deeksha");
		
		List<String> namesList2 = new ArrayList<>();
		
		System.out.println("Is the collection empty?"+checkifCollectionIsEmpty.test(namesList));
		
		System.out.println("Is the collection empty?"+checkifCollectionIsEmpty.test(namesList2));
	}

}
