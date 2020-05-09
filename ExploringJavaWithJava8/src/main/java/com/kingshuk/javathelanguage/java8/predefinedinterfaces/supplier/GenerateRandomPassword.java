package com.kingshuk.javathelanguage.java8.predefinedinterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class GenerateRandomPassword {
	// @formatter:off
	/**
	 * We're going to generate random password Using the following rules 1) Length
	 * should be 8 characters 2) 2,4,6,8 places should only be digits 3) 1,3,5,7
	 * places only uppercase alphabet or C#$
	 * 
	 * @param args
	 */
	// @formatter:on

	public static void main(String[] args) {
		Supplier<String> passwordGenerator = () -> {
			char[] passwordArray = new char[8];

			String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZC#$";

			Random random = new Random();

			Supplier<Character> randomCharacterGenerator = () -> {
				int nextInt = random.nextInt(alphabet.length() - 1);

				return alphabet.charAt(nextInt);
			};

			for (int i = 0; i < 8; i++) {
				if (i % 2 == 0) {
					passwordArray[i] = Character.forDigit(random.nextInt(10), 10);
				} else {
					passwordArray[i] = randomCharacterGenerator.get();
				}
			}

			return new String(passwordArray);
		};

		System.out.println("Generated password: " + passwordGenerator.get());
	}

}
