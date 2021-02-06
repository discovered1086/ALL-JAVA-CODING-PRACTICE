package com.kingshuk.javathelanguage.java8.predefinedinterfaces.unarybinary;

import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorPrimitivePractice {

	public static void main(String[] args) {
		// BiFunction<Integer, Integer, Integer> multiplication = (i,j) -> i*j;

		// BinaryOperator<Integer> multiplication = (i,j) -> i*j;

		IntBinaryOperator multiplication = (i, j) -> i * j;

		System.out.println("Multiplication of two numbers " + multiplication.applyAsInt(345, 5789));

		// BiFunction<Double, Double, Double> salaryIncrementor1 = (salary, percentage)
		// -> salary + ((salary *
		// percentage) / 100);

		// BinaryOperator<Double> salaryIncrementor2 = salary -> (salary, percentage) ->
		// salary + ((salary *
		// percentage) / 100);

		DoubleBinaryOperator salaryIncrementor = (salary, percentage) -> salary + ((salary * percentage) / 100);

		System.out.println("Salary incremented from 30000 to " + salaryIncrementor.applyAsDouble(30000.00, 30.00));

		// BiFunction<Long, Long, Long> sqUsingLongUnaryOperator1 = (i,j) -> i*j;

		// BinaryOperator<Long> multiplication = (i,j) -> i*j;

		LongBinaryOperator sqUsingLongUnaryOperator = (l, j) -> l * j;

		System.out.println("Square of 85875 is " + sqUsingLongUnaryOperator.applyAsLong(85875, 9899));
	}

}
