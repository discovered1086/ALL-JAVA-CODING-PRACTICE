package com.kingshuk.javathelanguage.java8.predefinedinterfaces.twoarguments;

import java.util.function.BiConsumer;

public class BiConsumerPractice {

	public static void main(String[] args) {
		BiConsumer<String, String> basicConcatenation = (s1, s2) -> System.out.println(s1.concat(s2));

		basicConcatenation.accept("Kingshuk ", "Mukherjee");
	}

}
