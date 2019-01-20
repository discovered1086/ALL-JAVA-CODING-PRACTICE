package mypractice.basicexamples.classandobject;

public class SuperParent {


	  /** 
	   * Main Method.
	   *
	   * @param args Command line arguments.
	   */
	  public static final void main(final String[] args) {
	    System.out.println(SomeClass.class + " --|> " + SomeClass.class.getSuperclass());
	    System.out.println(SomeOtherClass.class + " --|> "
	                       + SomeOtherClass.class.getSuperclass());
	  }

	  /**  
	   * Class with implicit java.lang.Object inheritance.
	   */
	  public class SomeClass {
	  }

	  /**  
	   * Class with explicit java.lang.Object inheritance.
	   */
	  public class SomeOtherClass extends Object {
	  }
	
}