package com.kingshuk.corejava.bharathcourse.polymorphism.overloading;

public class AutopromotionHarness {

	public void print(int i) {
		System.out.println("Integer method: "+i);
	}

	public void print(float f) {
		System.out.println("Float method: "+f);
	}

	public void print(long l) {
		System.out.println("Long method: "+l);
	}

	public void print(Double d) {
		System.out.println("Double method: "+d);
	}

	public static void main(String[] args) {
		AutopromotionHarness ap = new AutopromotionHarness();
		ap.print(123);
		ap.print(123.98f);
		ap.print(123l);
		ap.print(123.00);
	}

}
