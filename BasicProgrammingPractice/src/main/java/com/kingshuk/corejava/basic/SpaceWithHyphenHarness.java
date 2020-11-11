package com.kingshuk.corejava.basic;

public class SpaceWithHyphenHarness {

	public static void main(String[] args) {
		String input = "My name is Kingshuk Mukherjee";

		char[] inputArray = input.toCharArray();

		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == ' ') {
				inputArray[i] = '-';
			}
		}
		
		System.out.println(String.valueOf(inputArray));
	}

}
