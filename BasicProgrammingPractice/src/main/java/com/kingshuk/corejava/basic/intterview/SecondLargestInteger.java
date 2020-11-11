package com.kingshuk.corejava.basic.intterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestInteger {

	public static void main(String[] args) {
		//int [] numbers = new int [] {25,68,47,12,35,34};
		
		int [] numbers = new int [] {1,2,3,4,5,6,7,8,9};
		
		//expected 8
		
//		int largest = -65232;
//		int secondLargest = -65232;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i] > largest) {
//				largest = numbers[i];
//			}
//		}
//		
//		for (int i = 0; i < numbers.length; i++) {
//			if(numbers[i]>= secondLargest && numbers[i]< largest) {
//				secondLargest = numbers[i];
//			}
//		}
//		
////		for (int i = 0; i < numbers.length; i++) {
////			if(numbers[i]> secondLargest && largest > numbers[i]) {
////				secondLargest = numbers[i];
////			}else if(largest > numbers[i] && numbers[i]<= secondLargest) {
////				largest = numbers[i];
////			}
////		}
		
		List<Integer> asList = new ArrayList<>();
		
		for (int i = 0; i < numbers.length; i++) {
			asList.add(numbers[i]);
		}
		
		Collections.sort(asList);
		
		System.out.println(asList.get(asList.size()-2));
	}

}
