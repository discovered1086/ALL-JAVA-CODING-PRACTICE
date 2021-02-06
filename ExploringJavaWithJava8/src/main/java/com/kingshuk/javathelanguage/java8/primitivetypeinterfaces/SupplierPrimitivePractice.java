package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.Random;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;

public class SupplierPrimitivePractice {

	public static void main(String[] args) {
		//Supplier<Double> generateRandomNumber = () -> Math.random()*9;
		
		//System.out.println(generateRandomNumber.get());
		
		DoubleSupplier generateDoubleValue = () -> Math.random()*9;
		
		System.out.println(generateDoubleValue.getAsDouble());
		
		//IntSupplier generateRandomInteger = () -> (int) Math.random()*10;
		
		IntSupplier generateRandomInteger = () -> new Random().nextInt(9);
		
		System.out.println(generateRandomInteger.getAsInt());
	}

}
