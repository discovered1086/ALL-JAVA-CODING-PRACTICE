package com.kingshuk.corejava.bharathcourse.polymorphism;

import lombok.Getter;

@Getter
public class MacbookLaptop implements AppleLaptop{
	
	String name = "MacbookLaptop";
	
	public void start() {
		System.out.println("In the start method of the parent class");
	}
	
	public void shutDown() {
		System.out.println("In the shutdown method of the parent class");
	}

}
