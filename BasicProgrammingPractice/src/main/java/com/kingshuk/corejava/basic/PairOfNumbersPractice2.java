package com.kingshuk.corejava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PairOfNumbersPractice2 {

	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1, 1, 2, 2, 3, 4, 8, 6, 9, 7);

		int k = 2;

		List<Pair> pairs = new ArrayList<>();

		for (int i = 0; i < numbersList.size(); i++) {
			int current = numbersList.get(i);

			for (int j = 0; j < numbersList.size(); j++) {
				int loopNumber = numbersList.get(j);
				if ((current > loopNumber && loopNumber + k == current)
						|| (current <= loopNumber && current + k == loopNumber)) {
					Pair pair = new Pair(current, loopNumber);

					if (!pairs.contains(pair)) {
						pairs.add(pair);
					}

				}
			}

		}

		System.out.println("The number is: " + pairs.size());
		System.out.println("The pairs are: " + pairs);

	}

}
