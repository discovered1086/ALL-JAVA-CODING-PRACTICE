package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.function.IntPredicate;

public class PredicateJoinHarness {
	public static void main(String[] args) {
		Integer[] targetArray = { 2, 3, 9878, 57, 89, 7741, 587, 56 };

		IntPredicate checkDivisibleByTwo = theNumber -> theNumber % 2 == 0;

		IntPredicate checkDivisibleByFour = theNumber -> (theNumber % 4 == 0);

		printNotDivisibleByTwo(checkDivisibleByTwo.negate(), targetArray);

		System.out.println("---------------------------------------------\n");

		printDivisibleByTwoButNotByFour(checkDivisibleByTwo.and(checkDivisibleByFour.negate()), targetArray);
	}

	private static void printDivisibleByTwoButNotByFour(IntPredicate predicate1, Integer[] theArray) {
		for (Integer theNumber : theArray) {
			if (predicate1.test(theNumber)) {
				System.out.println(theNumber + " is divisible by two but NOT divisible by four");
			}
		}
	}

	private static void printNotDivisibleByTwo(IntPredicate predicate1, Integer[] theArray) {
		for (Integer theNumber : theArray) {
			if (predicate1.test(theNumber)) {
				System.out.println(theNumber + " is NOT divisible by two");
			}
		}
	}
}
