package com.kingshuk.corejava.bharathcourse.polymorphism;

import lombok.Getter;

@Getter
public class MacbookPro extends MacbookLaptop {
	
	String name = "MacbookPro";

	@Override
	public void start() {
		System.out.println("In the start method of the MackbookPro child class");
	}
	@Override
	public void shutDown() {
		System.out.println("In the shutdown method of the MackbookPro child class");
	}

}
