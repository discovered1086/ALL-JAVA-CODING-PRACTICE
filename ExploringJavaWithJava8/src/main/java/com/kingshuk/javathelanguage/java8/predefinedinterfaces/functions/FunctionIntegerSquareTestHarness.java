package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.IntUnaryOperator;

public class FunctionIntegerSquareTestHarness {

	public static void main(String[] args) {
		//Function<Integer, Integer> sqFunction = v -> Double.valueOf(Math.pow(v, 2)).intValue();
		
		IntUnaryOperator sqFunction = v -> (int) Math.pow(v, 2);
		
		System.out.println("The square root of 96 is "+sqFunction.applyAsInt(96));
	}

}
