package com.kingshuk.corejava.basic.intterview;

import java.util.function.IntPredicate;

public class TestHarness {
	
	IntPredicate numberCheck3 = number -> number % 3 ==0;
	
	IntPredicate numberCheck5 = number -> number % 5 ==0;

	public static void main(String[] args) {
		TestHarness t = new TestHarness();
		
		System.out.println(t.divisibleBy(112));
	}
	
	public String divisibleBy(int n1) {
		if(numberCheck3.and(numberCheck5).test(n1)) {
			return "Both";
		}else if(numberCheck5.negate().and(numberCheck3).test(n1)) {
			return "Three";
		}else if(numberCheck3.negate().and(numberCheck5).test(n1)) {
			return "Five";
		}else {
			return "None";
		}
	}
	
	
}
