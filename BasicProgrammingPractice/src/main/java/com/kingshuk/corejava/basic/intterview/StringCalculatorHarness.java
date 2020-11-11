package com.kingshuk.corejava.basic.intterview;

public class StringCalculatorHarness {

	public static void main(String[] args) {
		// 1+2+3+4-5+6
		String input = "1+1+4+6-2";

		char[] charArray = input.toCharArray();

		int result = 0;

		int i = 0;

		while (i < charArray.length) {
			if (i == 0) {
				result = result + Integer.parseInt(String.valueOf(charArray[i]));
			} else {
				if (isNumber(charArray[i])) {
					char operator = charArray[i - 1];
					if (operator == '+') {
						result = result + Integer.parseInt(String.valueOf(charArray[i]));
					} else if (operator == '-') {
						result = result - Integer.parseInt(String.valueOf(charArray[i]));
					}

				}
			}
			i++;
		}

		System.out.println(result);
	}

	public static boolean isNumber(Character c) {
		return c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
				|| c == '9';
	}

}
