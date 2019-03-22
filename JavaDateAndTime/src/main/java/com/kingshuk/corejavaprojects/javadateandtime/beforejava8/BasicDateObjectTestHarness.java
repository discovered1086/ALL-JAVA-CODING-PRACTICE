package com.kingshuk.corejavaprojects.javadateandtime.beforejava8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BasicDateObjectTestHarness {

	public static void main(String[] args) throws ParseException {
		// Using the no-arg constructor to create a date object representing the current
		// date and time
		Date d1 = new Date();
		System.out.println("Current date and time: " + d1);

		// Using the System.currentTimeMillis to initialize a date object
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println("Current date and time using System.currentTimeMillis: " + d2);

		// gets the time in millis since the epoch time
		System.out.println("Using the get time method: " + d1.getTime());

		// Setting up a new date for comparison
		Date d3 = new SimpleDateFormat("MM/dd/yyyy").parse("10/21/2019");

		System.out.println("Is d1 before d3? " + d1.before(d3));

		System.out.println("Is d1 after d3? " + d1.after(d3));
		
		System.out.println("Is d1 same as d2? "+d1.equals(d2));
		
		//compareTo returns -1 because d1 comes before d3
		System.out.println("Compare d1 and d3s? "+d1.compareTo(d3)); 

	}
}
