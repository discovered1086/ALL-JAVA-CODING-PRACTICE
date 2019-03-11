package com.kingshuk.javathelanguage.java8.staticmethods;

interface StaticMethodInterface{
	
	static void printSomething(String caller) {
		System.out.println("Inside the static method, called by "+caller);
	}
}

public class StaticMethodInInterfaceDemo implements StaticMethodInterface{

	public static void main(String[] args) {
		StaticMethodInInterfaceDemo demoClass = new StaticMethodInInterfaceDemo();
		
		//We can call it using the reference to the implementation class, or can we?No we can't
		//demoClass.printSomething();
		
		/*
		 * We can ONLY call using the interface name
		 * 
		 * 	Interface static method is not available to the implementation class. 
		 * 	So there's ONLY one way to call the,  by using the interface name.
		 *
		 *  So when it comes to static method inside the interface, the implementing class does NOT get any advantages as compared to the classes that 
		 *  don't implement the interface. Both have to call in the same way.
		 */
		StaticMethodInterface.printSomething("interface");
		
		//We can call using the implementation class name, or can we? No we can't
		//StaticMethodInInterfaceDemo.printSomething();
	}

}
