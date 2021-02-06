package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionPractice {

	public static void main(String[] args) {
		Function<Integer, Double> findSqrt1 =Math::sqrt;
		
		System.out.println(findSqrt1.apply(23));
		
		IntToDoubleFunction findSqrt =Math::sqrt;
		
		System.out.println(findSqrt.applyAsDouble(23));
	}
	

}
