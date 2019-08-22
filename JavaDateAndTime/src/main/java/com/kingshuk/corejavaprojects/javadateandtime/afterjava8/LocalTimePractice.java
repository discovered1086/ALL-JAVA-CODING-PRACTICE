package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalTime;

public class LocalTimePractice {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		System.out.println("Local hour: "+localTime.getHour());
		
		System.out.println("Local minute: "+localTime.getMinute());
		
		System.out.println("Local seconds: "+localTime.getSecond());
		
		System.out.println("Local nanoseconds: "+localTime.getNano());
		
		
	}

}
