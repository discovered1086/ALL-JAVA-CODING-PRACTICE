package mypractice.basicexamples.operators;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceOfTest {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello";
	    if (s instanceof String) {
	      System.out.println("is a String");
	    }
	    
	    s = null;
	    if (s instanceof String) {
	      System.out.println("true");
	    } else {
	      System.out.println("false");
	    }
	    
	    Object testObject = new Vector();
	    if (testObject instanceof Vector)
	      System.out.println("Object was an instance of the class java.util.Vector");
	    else if (testObject instanceof ArrayList)
	      System.out.println("Object was an instance of the class java.util.ArrayList");
	    else
	      System.out.println("Object was an instance of the " + testObject.getClass());
	    
	    
	    Dog aDog = new Dog();
	    if (aDog instanceof Animal) {
	      Animal ani = (Animal) aDog;
	      System.out.println(ani);
	    }
	    
	    A a = new A();
	    B b = new B();
	    C c = new C();
	    D d = new D();

	    if (a instanceof A)
	      System.out.println("a is instance of A");
	    if (b instanceof B)
	      System.out.println("b is instance of B");
	    if (c instanceof C)
	      System.out.println("c is instance of C");
	    if (c instanceof A)
	      System.out.println("c can be cast to A");

	    if (a instanceof C)
	      System.out.println("a can be cast to C");

	    System.out.println();

	    A ob;

	    ob = d; // A reference to d
	    System.out.println("ob now refers to d");
	    if (ob instanceof D)
	      System.out.println("ob is instance of D");

	    System.out.println();

	    ob = c; // A reference to c
	    System.out.println("ob now refers to c");

	    if (ob instanceof D)
	      System.out.println("ob can be cast to D");
	    else
	      System.out.println("ob cannot be cast to D");

	    if (ob instanceof A)
	      System.out.println("ob can be cast to A");

	    System.out.println();

	    // all objects can be cast to Object
	    if (a instanceof Object)
	      System.out.println("a may be cast to Object");
	    if (b instanceof Object)
	      System.out.println("b may be cast to Object");
	    if (c instanceof Object)
	      System.out.println("c may be cast to Object");
	    if (d instanceof Object)
	      System.out.println("d may be cast to Object");

	}

}

class A {
	  int i, j;
	}

	class B {
	  int i, j;
	}

	class C extends A {
	  int k;
	}

	class D extends A {
	  int k;
	}

class Animal {
	  public String toString() {
	    return "This is an animal ";
	  }
	}
	class Dog extends Animal {
	  public void sound() {
	    System.out.println("Woof Woof");
	  }
	}