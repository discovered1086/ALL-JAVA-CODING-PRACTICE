package com.kingshuk.corejava.bharathcourse.polymorphism;

public class RuntimePolymorphismHarness {

	public static void main(String[] args) {
//		MacbookLaptop m1 = new MacbookPro();
//			m1.start();
//			m1.shutDown();
//			
//		MacbookLaptop m2 = new MacbookAir();
//			m2.start();
//			m2.shutDown();

		AppleLaptop m1 = new MacbookPro();
		m1.start();
		m1.shutDown();

		AppleLaptop m2 = new MacbookAir();
		m2.start();
		m2.shutDown();
	}

}
