package com.kingshuk.corejavaprojects.javadateandtime.beforejava8;

import java.util.Date;

public class CurrentTimeInMillisTestHarness {

	public static void main(String[] args) {
		//Milliseconds that have passed since January 1, 1970
		System.out.println(System.currentTimeMillis());
		
		//Initializing date object with the returned value
		Date date = new Date(System.currentTimeMillis());
		
		System.out.println(date.toString());
	}

}
