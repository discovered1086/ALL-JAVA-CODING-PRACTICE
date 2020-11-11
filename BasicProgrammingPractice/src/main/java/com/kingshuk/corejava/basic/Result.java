package com.kingshuk.corejava.basic;

import java.util.ArrayList;
import java.util.List;

public class Result {

	/*
	 * Complete the 'countPairs' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY numbers 2. INTEGER k
	 */

	public static int countPairs(List<Integer> numbers, int k) {
		// Write your code here
		List<Pair> pairs = new ArrayList<>();

		for (int i = 0; i < numbers.size(); i++) {
			for (int j = 0; j < numbers.size(); j++) {
				if (numbers.get(i) + k == numbers.get(j)) {
					Pair pair = new Pair(numbers.get(i), numbers.get(j));
					if (!pairs.contains(pair)) {
						pairs.add(pair);
					}
				}
			}
		}

		return pairs.size();
	}

}
