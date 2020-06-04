package com.kingshuk.javathelanguage.java8.unarybinary;

import java.util.function.UnaryOperator;

public class UnaryOperatorPractice {

	public static void main(String[] args) {
		//Function<String, String> concatenation = s -> s.concat(" hello..!!");
		
		UnaryOperator<String> concatenation = s -> s.concat(" hello..!!");
		
		System.out.println(concatenation.apply("Mr.Kingshuk Mukherjee"));
	}

}
