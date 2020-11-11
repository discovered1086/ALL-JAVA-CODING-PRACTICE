package com.kingshuk.corejava.basic.intterview;

import java.util.ArrayList;
import java.util.List;

public class StringCalculatorHarness2 {

	public static void main(String[] args) {
		// 1+2+3+4-5+6
		String input = "7456454+87-98665+784589";

		// 494

		char[] charArray = input.toCharArray();

		int result = 0;

		int currentNumber = -456;

		int indexOfPreviousNumber = -456;

		List<Integer> numbersList = new ArrayList<>();

		List<Character> operators = new ArrayList<>();

		for (int i = 0; i < charArray.length; i++) {
			if (isNumber(charArray[i])) {
				if (indexOfPreviousNumber == i - 1) {
					currentNumber = currentNumber * 10 + Integer.parseInt(String.valueOf(charArray[i]));
				} else {
					currentNumber = Integer.parseInt(String.valueOf(charArray[i]));
				}

				indexOfPreviousNumber = i;
			} else {
				operators.add(charArray[i]);
			}

			if (!isNumber(charArray[i]) || i == charArray.length - 1) {
				numbersList.add(currentNumber);
			}
		}

		int j = 0;
		for (int k = 0; k < numbersList.size(); k++) {
			if (k == 0) {
				result = result + numbersList.get(k);
			} else {
				if (j < operators.size()) {
					Character operator = operators.get(j);
					if (operator == '+') {
						result = result + numbersList.get(k);
					} else if (operator == '-') {
						result = result - numbersList.get(k);
					}
					j++;
				}
			}

		}

		System.out.println(result);
	}

	public static boolean isNumber(Character c) {
		return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9';
	}

}
