package com.kingshuk.corejava.bharathcourse.boxingunboxing;

public class PrimitiveToStringConversionHarness {

	public static void main(String[] args) {
		int i = 100;
		
		String string1 = String.valueOf(i);
		
		int value = Integer.parseInt(string1);
		
		System.out.println(value);
		
		System.out.println(Integer.valueOf(string1));
		
		System.out.println(new Integer(value)); 	//Deprecated
		
		System.out.println(new Integer(string1));	//Deprecated
		
		byte b = 100;
		
		String string2 = String.valueOf(b);
		
		byte value2 = Byte.parseByte(string2);
		
		System.out.println(Byte.valueOf(string2));
		
		System.out.println(value2);
		
		System.out.println(new Byte(value2)); //Deprecated
		
		System.out.println(new Byte(string1));  //Deprecated
		
		
		
		
	}

}
