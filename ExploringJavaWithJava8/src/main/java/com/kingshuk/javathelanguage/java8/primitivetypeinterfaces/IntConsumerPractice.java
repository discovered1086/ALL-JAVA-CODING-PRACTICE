package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.function.IntConsumer;

public class IntConsumerPractice {

	public static void main(String[] args) {
		//Consumer<Integer> printSqrt = i -> System.out.println(Math.sqrt(i));
		
		//printSqrt.accept(49);
		
		IntConsumer printSqrt2 = i -> System.out.println(Math.sqrt(i));
		
		printSqrt2.accept(49);
	}

}
