package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class IntFunctionPractice {

	public static void main(String[] args) {
		//Function<Integer, Integer> findSquare = i -> i*i;
		
		//System.out.println("Square root of 56 is "+findSquare.apply(56));
		
		//Optimization level 1
		IntFunction<Integer> findSquare = i -> i*i;
		
		System.out.println("Square root of 56 is "+findSquare.apply(56));
		
		//Optimization level 2
		IntUnaryOperator findSquare2 =  i -> i*i;
		
		System.out.println("Square root of 56 is "+findSquare2.applyAsInt(56));
	}

}
