package com.kingshuk.javathelanguage.java8.staticmethods;

interface StaticMethodInterface2{
	
	static void printSomething(String caller) {
		System.out.println("Inside the static method of interface, called by "+caller);
	}
}

public class StaticMethodInInterfaceOverridingDemo implements StaticMethodInterface2{

	public static void main(String[] args) {
		StaticMethodInInterfaceOverridingDemo demoClass = new StaticMethodInInterfaceOverridingDemo();
		
		
		StaticMethodInterface.printSomething("interface");
		
		StaticMethodInInterfaceOverridingDemo.printSomething("class");
		
		demoClass.printSomething();
	}
	
	/*
	 * Now since the question of method overriding doesn't arise here as the method from the
	 * parent is not available to the child, We can declare a method in the child class
	 * with exactly the same signature, without any issues.
	 * 
	 * And it can be static, non-static,private - does not matter
	 */
	public static void printSomething(String caller) {
		System.out.println("Inside the static method of child class, called by "+caller);
	}
	
	public void printSomething() {
		System.out.println("Inside the non-static method of child class");
	}

}
