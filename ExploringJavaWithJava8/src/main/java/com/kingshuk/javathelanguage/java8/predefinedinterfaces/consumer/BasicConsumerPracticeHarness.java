package com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer;

import java.util.function.Consumer;

public class BasicConsumerPracticeHarness {

	public static void main(String[] args) {
		Consumer<String> printString = System.out::println;
		
		printString.accept("Print my name: Kingshuk Mukherjee");
	}

}
