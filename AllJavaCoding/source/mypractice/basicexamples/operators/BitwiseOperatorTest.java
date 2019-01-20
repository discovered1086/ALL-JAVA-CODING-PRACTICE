package mypractice.basicexamples.operators;

public class BitwiseOperatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(9 & 7);
		System.out.println(19 | 7);
		System.out.println(9 ^ 7);
		System.out.println(9 << 7);
		
	    int i = 1;
        System.out.println(i);
	    int j = ~i + 1;
        System.out.println(j);
	    i = ~j + 1;
	    System.out.println(i);
	    
	    String binary[] = {
	    	      "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111",
	    	      "1000", "1001", "1010", "1011", "1100", "1101", "1110", "1111"
	    	    };
	    	    int a = 3; // 0 + 2 + 1 or 0011 in binary
	    	    int b = 6; // 4 + 2 + 0 or 0110 in binary
	    	    int c = a | b;
	    	    int d = a & b;
	    	    int e = a ^ b;
	    	    int f = (~a & b) | (a & ~b);
	    	    int g = ~a & 0x0f;
	    	   
	    	    System.out.println("        a = " + binary[a]);
	    	    System.out.println("        b = " + binary[b]);
	    	    System.out.println("      a|b = " + binary[c]);
	    	    System.out.println("      a&b = " + binary[d]);
	    	    System.out.println("      a^b = " + binary[e]);
	    	    System.out.println("~a&b|a&~b = " + binary[f]);
	    	    System.out.println("       ~a = " + binary[g]);
	    	    
	    	     a = 1;
	    	     b = 2;
	    	     c = 3;

	    	    a |= 4;
	    	    b >>= 1;
	    	    c <<= 1;
	    	    a ^= c;
	    	    System.out.println("a = " + a);
	    	    System.out.println("b = " + b);
	    	    System.out.println("c = " + c);
	    	    
	    	    byte la = 64, lb;
	    	    	    	   
	    	    i = la << 2;
	    	    lb = (byte) (la << 2);
	    	   
	    	    System.out.println("Original value of a: " + la);
	    	    System.out.println("i and b: " + i + " " + lb);
	    	    
	    	    int num = 0xFFFFFFE;
	    	    
	    	    for(i=0; i<4; i++) {
	    	      num = num << 1;
	    	      System.out.println(num);
	    	    }
	    	    a = 32;
	    	    a = a >> 2; // a now contains 8

	    	    System.out.println(a);
	    	    
	    	    a = -1;
	    	    a = a >>> 24;

	    	    System.out.println(a);

	    	    lb = 11;

	    	    System.out.println(lb >> 1); 
	    	    char hex[] = {
	    	    	      '0', '1', '2', '3', '4', '5', '6', '7',
	    	    	      '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
	    	    	    };
	    	    	    byte bb = (byte) 0xf1;
	    	    	    byte bc = (byte) (b >> 4);
	    	    	    byte bd = (byte) (b >>> 4);
	    	    	    byte be = (byte) ((b & 0xff) >> 4);
	    	    	    System.out.println("              bb = 0x"
	    	    	      + hex[(bb >> 4) & 0x0f] + hex[bb & 0x0f]);
	    	    	    System.out.println("         bc >> 4 = 0x"
	    	    	      + hex[(bc >> 4) & 0x0f] + hex[bc & 0x0f]);
	    	    	    System.out.println("        bd >>> 4 = 0x"
	    	    	      + hex[(bd >> 4) & 0x0f] + hex[bd & 0x0f]);
	    	    	    System.out.println("(be & 0xff) >> 4 = 0x"
	    	    	      + hex[(be >> 4) & 0x0f] + hex[be & 0x0f]);
	}

}
