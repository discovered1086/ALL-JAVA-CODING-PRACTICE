package mypractice.basicexamples.operators;

public class IncrementDecrementTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
	    int b = 2;
	    int c;
	    int d;
	    c = ++b;
	    d = a++;
	    c++;
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	    System.out.println("c = " + c);
	    System.out.println("d = " + d);
	    
	    int numA = 5;
	    int numB = 10;
	    int numC = 0;

	    numC = ++numA + numB;
	    
	    System.out.println(numA);
	    System.out.println(numC);
	    
	    numC = --numA + numB--;
	    System.out.println(numA);
	    System.out.println(numC);
	    
	    double da = 12.12;
	     
	     System.out.println( a-- );
	     System.out.println( a++ );
	     System.out.println( --a );
	     System.out.println( ++a );
	}

}
