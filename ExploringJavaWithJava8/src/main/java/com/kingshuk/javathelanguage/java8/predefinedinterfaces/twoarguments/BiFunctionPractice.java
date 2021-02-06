package com.kingshuk.javathelanguage.java8.predefinedinterfaces.twoarguments;

import java.util.function.BiFunction;

public class BiFunctionPractice {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, String> sumOfTwoValues = (a, b) -> String.valueOf(a + b);

		System.out.println("The sum of two values: " + sumOfTwoValues.apply(27878, 9787));
	}

}
