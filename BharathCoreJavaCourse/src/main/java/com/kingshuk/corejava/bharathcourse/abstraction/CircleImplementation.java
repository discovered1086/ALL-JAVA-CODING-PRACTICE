package com.kingshuk.corejava.bharathcourse.abstraction;

public class CircleImplementation implements CircleOne, CircleTwo {
	
	private static final float COMMON_RADIUS = 4.12f;

	@Override
	public void calculateArea() {
		System.out.println("Area is: "+ 1* CircleOne.PI* COMMON_RADIUS);
	}

	@Override
	public void calculateArea(float radius) {
		System.out.println("Area is: "+ 1* CircleOne.PI* radius);
	}

	public static void main(String[] args) {
		CircleImplementation circleImplementation = new CircleImplementation();
		
		circleImplementation.calculateArea();
		circleImplementation.calculateArea(5.12f);
		
	}

}
