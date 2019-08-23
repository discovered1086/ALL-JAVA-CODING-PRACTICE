package com.kingshuk.javathelanguage.java8.doublecolon.methodreference;

@FunctionalInterface
interface MyInterface{
	
	void m1();
}

public class MethodReferencePractice {

	public static void main(String[] args) {
		MyInterface myInterface = () -> {
			System.out.println(" This is an implementation of lambda expression");
		};
		
		myInterface.m1();
		
		MyInterface myInterface2 = MethodReferencePractice::m2;
		
		myInterface2.m1();
		
		MyInterface myInterface3 = new MethodReferencePractice()::m3;
		
		myInterface3.m1();
	}
	
	public static void m2() {
		System.out.println(" This is an implementation of lambda"+
					"expression through method reference");
	}
	
	public void m3() {
		System.out.println(" This is an implementation of lambda"+
					"expression through method reference -  instance method");
	}

}
