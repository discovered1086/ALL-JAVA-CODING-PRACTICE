package com.kingshuk.corejava.bharathcourse.polymorphism;

public class VariableResolutionDuringPolymorphismHarness {

	public static void main(String[] args) {

		MacbookLaptop parent = new MacbookLaptop();
		MacbookPro child = new MacbookPro();
		
		System.out.println(parent.name);
		
		System.out.println(child.name);
		
		MacbookLaptop child1 = new MacbookPro();
		
		System.out.println(child1.name);
	}

}
