package mypractice.basicexamples.classandobject;

public class VarTest {
	
	 public static void myMethod(Object parms[]) {
		    for (int i = 0; i < parms.length; i++)
		      System.out.println(parms[i]);
		  }
	 
	// vaTest() now uses a vararg.
	  public static void vaTest(int... v) {
	    System.out.print("Number of args: " + v.length + " Contents: ");
	    for (int x : v)
	      System.out.print(x + " ");

	    System.out.println();
	  }

	  static void vaTest(String msg, int... v) {
		    System.out.print(msg + v.length + " Contents: ");

		    for (int x : v) {
		      System.out.print(x + " ");
		    }
		    System.out.println();
		  }
	  
	  static void vaTest(boolean... v) {
		    System.out.print("vaTest(boolean ...) " + "Number of args: " + v.length + " Contents: ");

		    for (boolean x : v)
		      System.out.print(x + " ");

		    System.out.println();
		  }
	  
	  public static void printAll(Object... args) {
		    for (Object arg : args) {
		      System.out.print("  " + arg);
		    }
		    System.out.println();
		  }
	  
	  // Average of a variable number of values
	  public static double average(Double... args) {
	    if (args.length == 0) {
	      return 0.0;
	    }
	    double ave = 0.0;
	    for (double value : args) {
	      ave += value;
	    }
	    return ave / args.length;
	  }
	  
	  public static void main(String args[]) {
		  
		myMethod(new Object[] { "value 1", new Integer(2), "value n" });
		  
	    vaTest(10); // 1 arg
	    vaTest(1, 2, 3); // 3 args
	   // vaTest(); // no args
	    
	    vaTest(true, false, false);
	    
	    vaTest("One vararg: ", 10);
	    vaTest("Three varargs: ", 1, 2, 3);
	    vaTest("No varargs: ");
	    
	    printAll(2, "two", 4, "four", 4.5, "four point five"); 
	    printAll();
	    printAll(25, "Anything goes", true, 4E4, false);
	    
	    System.out.println(average(1.0, 2.0, 3.0, 4.0, 5.0));
	    System.out.println(average(3.14, 1.414, 1.732));
	    System.out.println(average(new Double(7), new Double(8), new Double(9), new Double(10)));
	  }
	}