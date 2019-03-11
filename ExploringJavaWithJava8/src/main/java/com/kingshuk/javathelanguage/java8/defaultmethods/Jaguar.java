package com.kingshuk.javathelanguage.java8.defaultmethods;

public class Jaguar implements Animal, Mammals {

	@Override
	public void eats() {
		Mammals.super.eats();
	}

	

}
