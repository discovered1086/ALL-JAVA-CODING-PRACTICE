package com.kingshuk.corejava.basic;

import java.util.ArrayList;
import java.util.List;

public class StringReversal {

	public static void main(String[] args) {
		String input = "My name is Kingshuk Mukherjee!";

		char[] inputArray = input.toCharArray();

		List<Integer> arrayOfIndices = new ArrayList<>();

		int counter = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				arrayOfIndices.add(counter, i);
				counter++;
			}
		}

		counter = 0;

		char[] finalArray = new char[inputArray.length];

		for (int j = inputArray.length - 1; j >= 0; j--) {
			if (counter != arrayOfIndices.size() && inputArray.length - (j + 1) == arrayOfIndices.get(counter)) {
				finalArray[inputArray.length - (j + 1)] = ' ';
				counter++;
			} else {
				if (inputArray[j] != ' ') {
					finalArray[inputArray.length - (j + 1)] = inputArray[j];
				}

			}
		}

		String finalString = String.valueOf(finalArray);

		System.out.println(finalString);
	}

}
