package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.function.IntPredicate;

public class PredicateJoinOrConditionHarness {
	public static void main(String[] args) {
		Integer[] targetArray = { 2, 3, 9878, 57, 89, 7741, 587, 56 };

		IntPredicate checkDivisibleByTwo = theNumber -> theNumber % 2 == 0;

		IntPredicate checkDivisibleByFour = theNumber -> (theNumber % 4 == 0);

		printNotDivisibleByTwoOrDivisibleByFour(checkDivisibleByTwo.or(checkDivisibleByFour), targetArray);

		System.out.println("---------------------------------------------\n");

	}

	private static void printNotDivisibleByTwoOrDivisibleByFour(IntPredicate predicate1, Integer[] theArray) {
		for (Integer theNumber : theArray) {
			if (predicate1.test(theNumber)) {
				System.out.println(theNumber + " is divisible by two or divisble by four");
			}
		}
	}
}
