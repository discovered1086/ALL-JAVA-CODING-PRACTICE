package mypractice.basicexamples.classandobject;

public class StaticNestedClassDemo {
	
		  /**
		   * Main method.
		   * 
		   * @param args
		   *          Command line arguments.
		   */
		  public static void main(final String[] args) {
		    OuterClass.SomeClass obj = new OuterClass.SomeClass();
		    obj.someMethod();
		    // OuterClass.SomeOtherClass prot = new OuterClass.SomeOtherClass(); // <=
		    // Compiler error
		    OuterClass.doPrivate();
		  }
}
class OuterClass {
	  /** Holds the name. */
	  private static final String name = "Robert";

	  /** Holds the company. */
	  private static String company = "O'Reilly";

	  /** Holds a value. */
	  private int value = 5;

	  /**
	   * Getter for the property company.
	   * 
	   * @return The current company.
	   */
	  public static String getCompany() {
	    return company;
	  }

	  /**
	   * Getter for the variable name.
	   * 
	   * @return The current name.
	   */
	  public static String getName() {
	    return name;
	  }

	  /**
	   * Getter for the variable company.
	   * 
	   * @return the current company.
	   */
	  public int getValue() {
	    return value;
	  }

	  /**
	   * Demo of instatiation of a private class.
	   */
	  public static void doPrivate() {
	    SomeOtherClass cl = new SomeOtherClass();
	    cl.someMethod();
	  }

	  /**
	   * A demo nested static class.
	   * 
	   * @author <a href=mailto:kraythe@arcor.de>Robert Simmons jr. (kraythe)</a>
	   * @version $Revision: 1.5 $
	   */
	  public static class SomeClass {
	    /**
	     * a demo method.
	     */
	    public void someMethod() {
	      System.out.println(company);
	      System.out.println(name);
	      // System.out.println(value); // <= Compiler error
	    }
	  }

	  /**
	   * A demo nested static class.
	   * 
	   * @author <a href=mailto:kraythe@arcor.de>Robert Simmons jr. (kraythe)</a>
	   * @version $Revision: 1.5 $
	   */
	  protected static class YetAnotherClass {
	  }

	  /**
	   * A demo nested static class.
	   * 
	   * @author <a href=mailto:kraythe@arcor.de>Robert Simmons jr. (kraythe)</a>
	   * @version $Revision: 1.5 $
	   */
	  private static class SomeOtherClass {
	    /**
	     * a demo method.
	     */
	    public void someMethod() {
	      System.out.println("Protect me!");
	    }
	  }
	}
