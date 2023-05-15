package com.kingshuk.corejava.bharathcourse.boxingunboxing;

public class BasicBoxingUnBoxingHarness {

	public static void main(String[] args) {
		int i = 100;
		
		//We don't generally need to do this as the compiler takes care of this.
		//We'll see that later
		Integer integer = Integer.valueOf(i);
		
		int value = integer.intValue();
		
		System.out.println(value);
		
		byte b = 100;
		
		Byte byte1 = Byte.valueOf(b);
		
		byte value2 = byte1.byteValue();
		
		System.out.println(value2);
		
		
	}

}
