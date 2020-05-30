package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

public class AutoboxingExample {

	public static void main(String[] args) {
		Integer i = 10; //With autoboxing after java 1.5
		
		//Integer i = Integer.valueOf(10); Internally compiler will convert it to this statement
		
		Long longValue = 10l; //With autoboxing after java 1.5
		
		//Long i = Long.valueOf(10l); Internally compiler will convert it to this statement
		
		Long longValue2 = Long.valueOf(10l);//Without autoboxing before java 1.5
		
		Integer i2 = Integer.valueOf(10); //Without autoboxing before java 1.5
		
		System.out.println(i);
		System.out.println(longValue);
		System.out.println(longValue2);
		System.out.println(i2);
		
		long longValue3 = longValue+19000l;
		
		//long longValue3 = longValue.longValue(); Internally compiler will convert it to this statement
		
		System.out.println(longValue3);
		
	}

}
