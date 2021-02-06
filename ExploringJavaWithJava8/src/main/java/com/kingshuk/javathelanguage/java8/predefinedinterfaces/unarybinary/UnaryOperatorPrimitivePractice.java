package com.kingshuk.javathelanguage.java8.predefinedinterfaces.unarybinary;

import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class UnaryOperatorPrimitivePractice {

	public static void main(String[] args) {
		// Function<Integer, Integer> sqrtUsingFunction = i -> i*i;

		// UnaryOperator<Integer> sqrtUsingUnaryOperator = i-> i*i;

		IntUnaryOperator sqrtUsingIntUnaryOperator = i -> i * i;

		System.out.println("Square of 897 is " + sqrtUsingIntUnaryOperator.applyAsInt(897));
		
		// Function<Double, Double> salaryIncrementor1 = salary -> salary + ((salary * 30) / 100);
		
		// UnaryOperator<Double> salaryIncrementor2 = salary -> salary + ((salary * 30) / 100);

		DoubleUnaryOperator salaryIncrementor = salary -> salary + ((salary * 30) / 100);

		System.out.println("Salary incremented from 30000 to " + salaryIncrementor.applyAsDouble(30000.00));
		
		// Function<Long, Long> sqUsingLongUnaryOperator1 = l -> l * l;
		
		// UnaryOperator<Long> sqUsingLongUnaryOperator2 = l -> l * l;

		LongUnaryOperator sqUsingLongUnaryOperator = l -> l * l;

		System.out.println("Square of 85875 is " + sqUsingLongUnaryOperator.applyAsLong(85875));
	}

}
