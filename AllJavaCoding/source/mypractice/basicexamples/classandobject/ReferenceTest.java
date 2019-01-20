package mypractice.basicexamples.classandobject;
import java.util.Vector;
public class ReferenceTest {


  /** 
   * Main method.
   *
   * @param args Command Line arguments.
   */
  public static  void main(final String[] args) {
    Vector source = new Vector();
    source.add("Java Script");
    source.add("XML");
    source.add("Java");
    System.out.println("Original Vector");
    System.out.println(source.toString());
    // -- Try the first method. 
    someMethod(source);
    System.out.println("After first method.");
    System.out.println(source.toString());
    // -- Try the second method. 
    someOtherMethod(source);
    System.out.println("After second method.");
    System.out.println(source.toString());
  }

  /** 
   * Try using a vector without changing it.
   *
   * @param source The source Vector.
   */
  public static void someMethod(Vector source) {
    Vector target = source;
    target.add("Oracle");
  }

  /** 
   * Try using a vector without changing it with final parameter.
   *
   * @param source The source Vector.
   */
  public static void someOtherMethod(final Vector source) {
    Vector target = source;
    target.add("J2EE");  // still changes v.
    source.add("Pattern");
    //source = new Vector(); // compiler error.
  }
}
