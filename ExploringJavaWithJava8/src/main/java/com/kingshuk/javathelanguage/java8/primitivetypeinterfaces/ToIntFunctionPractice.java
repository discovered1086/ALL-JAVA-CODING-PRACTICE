package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.function.ToIntFunction;

public class ToIntFunctionPractice {

	public static void main(String[] args) {
		//Function<String, Integer> findLength = String::length;
		
		//System.out.println(findLength.apply("Kingshuk Mukherjee"));
		
		ToIntFunction<String> findLength = String::length;
		
		System.out.println(findLength.applyAsInt("Kingshuk Mukherjee"));
	}

}
