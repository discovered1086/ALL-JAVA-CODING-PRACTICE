package com.kingshuk.javathelanguage.java8.predefinedinterfaces.twoarguments;

import java.util.function.BiPredicate;

public class BiPredicatePracticeHarness {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> sumIsEven = (i1, i2) -> (i1 + i2) % 2 == 0;

		System.out.println("Sum is even: " + sumIsEven.test(200, 8787));
		
		System.out.println("Sum is even: " + sumIsEven.test(200, 878));
	}

}
