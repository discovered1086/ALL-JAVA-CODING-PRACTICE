package mypractice.basicexamples.operators;

import java.util.Random;

public class ArithmeticOperatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Integer Arithmetic");
	    int a = 1 + 1;
	    int b = a * 3;
	    int c = b / 4;
	    int d = c - a;
	    int e = -d;
	    System.out.println("a = " + a);
	    System.out.println("b = " + b);
	    System.out.println("c = " + c);
	    System.out.println("d = " + d);
	    System.out.println("e = " + e);
	    
	    a = 3 % 2;
	    b = 11 % 3;
	    c = 7 % -3;

	    System.out.println(a);
	    System.out.println(b);
	    System.out.println(c);
		
	   
	    // arithmetic using doubles
	    System.out.println("\nFloating Point Arithmetic");
	    double da = 1 + 1;
	    double db = da * 3;
	    double dc = db / 4;
	    double dd = dc - a;
	    double de = -dd;
	    System.out.println("da = " + da);
	    System.out.println("db = " + db);
	    System.out.println("dc = " + dc);
	    System.out.println("dd = " + dd);
	    System.out.println("de = " + de);
	    
	    da = 2.4;
	    db = 0.2;

	    System.out.println( a % b );
	   	    
	    Random rand = new Random();
	    int i, j, k;
	    j = rand.nextInt(100) + 1;
	    k = rand.nextInt(100) + 1;
	    printInt("j", j);
	    printInt("k", k);
	    i = j + k;
	    printInt("j + k", i);
	    i = j - k;
	    printInt("j - k", i);
	    i = k / j;
	    printInt("k / j", i);
	    i = k * j;
	    printInt("k * j", i);
	    i = k % j;
	    printInt("k % j", i);
	    j %= k;
	    printInt("j %= k", j);
	    // Floating-point number tests:
	    float u, v, w; // applies to doubles, too
	    v = rand.nextFloat();
	    w = rand.nextFloat();
	    printFloat("v", v);
	    printFloat("w", w);
	    u = v + w;
	    printFloat("v + w", u);
	    u = v - w;
	    printFloat("v - w", u);
	    u = v * w;
	    printFloat("v * w", u);
	    u = v / w;
	    printFloat("v / w", u);
	    // the following also works for
	    // char, byte, short, int, long,
	    // and double:
	    u += v;
	    printFloat("u += v", u);
	    u -= v;
	    printFloat("u -= v", u);
	    u *= v;
	    printFloat("u *= v", u);
	    u /= v;
	    printFloat("u /= v", u);
	}
	
	static void printInt(String s, int i) {
	    System.out.println(s + " = " + i);
	  }

	  static void printFloat(String s, float f) {
	    System.out.println(s + " = " + f);
	  }

}
