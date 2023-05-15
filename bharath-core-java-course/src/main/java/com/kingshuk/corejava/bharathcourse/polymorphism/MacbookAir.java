package com.kingshuk.corejava.bharathcourse.polymorphism;

public class MacbookAir extends MacbookLaptop {
	@Override
	public void start() {
		System.out.println("In the start method of the MacbookAir child class");
	}
	@Override
	public void shutDown() {
		System.out.println("In the shutdown method of the MacbookAir child class");
	}
}
