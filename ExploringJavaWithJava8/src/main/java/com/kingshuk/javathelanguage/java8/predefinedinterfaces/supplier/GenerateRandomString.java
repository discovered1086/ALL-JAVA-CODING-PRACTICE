package com.kingshuk.javathelanguage.java8.predefinedinterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateRandomString {

	public static void main(String[] args) {
		Supplier<String> randomNames = () ->{
			String[] names = {"Kingshuk", "Deeksha", "Amit", "Mayuri", "Mainak"};
			
			int number = new Random().nextInt(5);
			
			return names[number];
		};
		
		System.out.println(randomNames.get());
	}

}
