package mypractice.basicexamples.classandobject;

public class UseStatic {
	  static int a = 3;
	   int b;
	   
	  static void meth(int x) {
	    System.out.println("x = " + x);
	    System.out.println("a = " + a);
	    // System.out.println("b = " + b);
	  }
	  void meth1()
	  {
		  System.out.println("b = " + b);
	  }
	 // static initalization block  
	  static {
	    System.out.println("Static block initialized.");
	    a = a * 4;
	  }

	  // initialization block
	  {
		  b = a * 4;
		  System.out.println("initialized block.");
	  }
	  
	  // constructor
	  UseStatic(){
		  System.out.println("Constructor");
	  }
	  
	 /* static int classField = 3;

	  static {
	    System.out.println(" : " + classField);

	    classField = 1;
	    for (int i = 2; i < 6; i++)
	      classField *= i;
	  }

	  static {
	    System.out.println(" = " + classField);
	  }*/
	  public static void main(String args[]) {
		  UseStatic.meth(42);
		  for(int i = 0 ; i < 5; i++)
		  {
			  UseStatic us = new UseStatic();
		  }
		  
	 //   System.out.println(classField);
	  }
	}
