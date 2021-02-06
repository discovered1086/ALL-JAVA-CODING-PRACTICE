package com.kingshuk.javathelanguage.java8.predefinedinterfaces.unarybinary;

import java.util.function.BinaryOperator;

public class BinaryOperatorPractice {

	public static void main(String[] args) {
		// BiFunction<String, String, String> concatenation = (s1, s2) -> s1.concat(s2);

		BinaryOperator<String> concatenation = (s1, s2) -> s1.concat(s2);

		System.out.println("Hello Mr. " + concatenation.apply("Kingshuk ", "Mukherjee"));
	}

}
