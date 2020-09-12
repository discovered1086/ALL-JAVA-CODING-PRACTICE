package com.kingshuk.corejava.bharathcourse.polymorphism.overloading;

public class AutopromotionHarnessWithString {

	public void print(char c) {
		System.out.println("Char method: " + c);
	}

	public void print(String s) {
		System.out.println("String method: " + s);
	}

	public static void main(String[] args) {
		AutopromotionHarnessWithString ap = new AutopromotionHarnessWithString();
		ap.print('c');
		ap.print("Kingshuk");
	}

}
