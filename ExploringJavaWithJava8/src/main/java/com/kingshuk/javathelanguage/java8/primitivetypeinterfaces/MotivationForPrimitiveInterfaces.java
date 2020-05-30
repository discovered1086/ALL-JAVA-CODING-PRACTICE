package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.function.IntPredicate;

public class MotivationForPrimitiveInterfaces {

	public static void main(String[] args) {
		int[] intArray = { 0, 10, 12, 45, 79, 23 };

		IntPredicate checkEven = i -> i % 2 == 0;

		System.out.println("The even numbers are: ");
		for (int j : intArray) {
			if (checkEven.test(j)) {
				System.out.println(j);
			}
		}
	}

}
