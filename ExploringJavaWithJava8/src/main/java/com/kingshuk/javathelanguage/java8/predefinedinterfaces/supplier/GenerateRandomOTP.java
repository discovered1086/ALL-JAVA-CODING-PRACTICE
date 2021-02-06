package com.kingshuk.javathelanguage.java8.predefinedinterfaces.supplier;

import java.util.Random;
import java.util.function.Supplier;

/**
 * Class for practicing Supplier by generating a 6 digit OTP using the
 * pre-defined functional interface
 * 
 * @author kingshuksmacbookpro
 *
 */
public class GenerateRandomOTP {

	public static void main(String[] args) {
		Supplier<String> otpGenerator = () -> {
			StringBuilder builder = new StringBuilder();
			Random random = new Random();

			for (int i = 0; i < 6; i++) {
				builder.append(random.nextInt(10));
			}

			return builder.toString();
		};

		for (int i = 0; i < 15; i++) {
			System.out.println(otpGenerator.get());
		}
	}

}
