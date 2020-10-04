package com.kingshuk.corejava.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
class Pair {
	int firstNumber;
	int secondNumber;

	@Override
	public boolean equals(Object obj) {
		Pair p = (Pair) obj;

		return (p.firstNumber == this.firstNumber || p.secondNumber == this.firstNumber)
				&& (p.firstNumber == this.secondNumber || p.secondNumber == this.secondNumber);
	}

}

public class PairOfNumbersPractice {

	public static void main(String[] args) {
		List<Integer> songsDurationList = Arrays.asList(10,50,90,30);

		List<Pair> pairs = new ArrayList<>();

		for (int i = 0; i < songsDurationList.size(); i++) {
			int current = songsDurationList.get(i);

			for (int j = 0; j < songsDurationList.size(); j++) {
				if (current != songsDurationList.get(j) && (current + songsDurationList.get(j)) % 60 == 0) {
					Pair pair = new Pair(current, songsDurationList.get(j));

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
