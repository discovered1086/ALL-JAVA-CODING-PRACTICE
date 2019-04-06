package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.Function;

public class SimpleFunctionIdentiyTest {

	public static void main(String[] args) {
		Function<String, String> identifyFunction = Function.identity();
		
		/*
		 * Functions created through the identity() method return the same value back.
		 * Very rarely we have such a requirement
		 */
		System.out.println(identifyFunction.apply("Kingshuk"));
	}

}
