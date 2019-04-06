package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions.functionchaining;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.Function;

public class FunctionAndThenTest {

	public static void main(String[] args) {
		Function<Date, Integer> ageCalculatorFunction = date -> {
			DateFormat format = new SimpleDateFormat("yyyyMMdd");

			int dateProvided = Integer.parseInt(format.format(date));

			int currentDate = Integer.parseInt(format.format(new Date()));

			return (currentDate - dateProvided) / 10000;

		};

		Function<Integer, String> checkAge = age -> {
			return (age < 18) ? "He's a kid" : (age >= 60) ? "He's an old man" : "He's a middle aged man";
		};

		String date = "10/16/1986";

		try {
			Date dob = new SimpleDateFormat("MM/dd/yyyy").parse(date);

			System.out.println("Type of man he is: " + ageCalculatorFunction.andThen(checkAge).apply(dob));

			System.out.println(
					"Type of man he is (in reverse order): " + checkAge.compose(ageCalculatorFunction).apply(dob));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
