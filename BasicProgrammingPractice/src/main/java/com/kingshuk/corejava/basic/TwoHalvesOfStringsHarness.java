package com.kingshuk.corejava.basic;

public class TwoHalvesOfStringsHarness {

	public static void main(String[] args) {
		String input = "sunshine";

		// target output : hsoebtraarcdy

		char[] completeArray = input.toCharArray();

		char[] finalArray = new char[completeArray.length];

		int counter1 = Math.floorDiv(completeArray.length, 2) - 1;

		System.out.println(counter1);

		int counter2 = completeArray.length - 1;

		int i = 0;
		while (i < finalArray.length) {
			if (counter1 != -1 && i % 2 == 0) {
				finalArray[i] = completeArray[counter1];
				counter1--;
			} else {
				if (counter2 != Math.floorDiv(completeArray.length, 2) - 1) {
					finalArray[i] = completeArray[counter2];
					counter2--;
				}

			}
			i++;
		}

		System.out.println(String.valueOf(finalArray));
	}

}
