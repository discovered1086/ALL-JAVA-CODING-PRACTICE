package mypractice.basicexamples.operators;

public class LogicalTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int value = 8;
	    int count = 10;
	    int limit = 11;
	    
	    if (++value % 2 == 0 | ++count < limit) {
	        System.out.println("here");
	        System.out.println(value);
	        System.out.println(count);
	      }
	      System.out.println("there");
	      System.out.println(value);
	      System.out.println(count);

	    if (++value % 2 == 0 & ++count < limit) {
	      System.out.println("here");
	      System.out.println(value);
	      System.out.println(count);
	    }
	    System.out.println("there");
	    System.out.println(value);
	    System.out.println(count);
		
		 if (test1(0) && test2(2) && test3(2))
		      System.out.println("expression is true");
		    else
		      System.out.println("expression is false");
	}
	static boolean test1(int val) {
	    System.out.println("test1(" + val + ")");
	    System.out.println("result: " + (val < 1));
	    return val < 1;
	  }

	  static boolean test2(int val) {
	    System.out.println("test2(" + val + ")");
	    System.out.println("result: " + (val < 2));
	    return val < 2;
	  }

	  static boolean test3(int val) {
	    System.out.println("test3(" + val + ")");
	    System.out.println("result: " + (val < 3));
	    return val < 3;
	  }
}
