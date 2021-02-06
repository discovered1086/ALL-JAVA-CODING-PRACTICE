package com.kingshuk.corejava.bharathcourse.typecasting;

public class TypeCastingOutOfRangeHarness {

	public static void main(String[] args) {
		long l = 2147483650l;
		
		int li = (int) l;
		
		System.out.println(li);
		
		int i = 90000;
		
		byte b = (byte) i;
		
		System.out.println(b);
	}

}
