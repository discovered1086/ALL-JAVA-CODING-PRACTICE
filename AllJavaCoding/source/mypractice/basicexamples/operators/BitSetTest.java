package mypractice.basicexamples.operators;

import java.util.BitSet;

public class BitSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create the bitset
	    BitSet bits = new BitSet();

	    // Set a bit on
	    bits.set(2); 

	    // Retrieving the value of a bit
	    boolean b = bits.get(0); 
	    System.out.println(b);
	    b = bits.get(2); 
	    System.out.println(b);
	    // Clear a bit
	    bits.clear(1);

	    // Setting a range of bits
	    BitSet bits2 = new BitSet();
	    bits2.set(1, 4); 

	    // And'ing two bitsets
	    bits.and(bits2); 

	    // Xor'ing two bitsets
	    bits.xor(bits2); 

	    // Flip all bits in the bitset
	    bits.flip(0, bits.length()); 

	    // Andnot'ing two bitsets
	    bits.andNot(bits2); 

	    // Or'ing two bitsets
	    bits.or(bits2); 
	    
	    System.out.println(fromByteArray(new byte[]{1,2,3}));
	    
	    BitSet bitset = new BitSet();
	    bitset.set(1);
	    System.out.println(toByteArray(bitset));
	}
	
	 public static byte[] toByteArray(BitSet bits) {
		    byte[] bytes = new byte[bits.length() / 8 + 1];
		    for (int i = 0; i < bits.length(); i++) {
		      if (bits.get(i)) {
		        bytes[bytes.length - i / 8 - 1] |= 1 << (i % 8);
		      }
		    }
		    return bytes;
		  }
	
	public static BitSet fromByteArray(byte[] bytes) {
	    BitSet bits = new BitSet();
	    for (int i = 0; i < bytes.length * 8; i++) {
	      if ((bytes[bytes.length - i / 8 - 1] & (1 << (i % 8))) > 0) {
	        bits.set(i);
	      }
	    }
	    return bits;
	  }

}
