package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.function.Predicate;

public class PredicateProgramForStringHarness {

	public static void main(String[] args) {
		// Predicate<String> startsWithKPredicate = s ->
		// StringUtils.startsWithIgnoreCase(s, "K");

		// Or we can use primitive methods for practice
		Predicate<String> startsWithKPredicate = s -> s.charAt(0) == 'k';

		String[] inputStrings = { "Kingshuk", "Deeksha", "Kaushik", "Amit", "kohler" };

		for (String string : inputStrings) {
			if (startsWithKPredicate.negate().test(string)) {
				System.out.println(string + " does NOT start with 'K'");
			} else {
				System.out.println(string + " starts with 'K'");
			}
		}
	}

}
