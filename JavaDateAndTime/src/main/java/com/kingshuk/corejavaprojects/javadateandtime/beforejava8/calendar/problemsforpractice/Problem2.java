package com.kingshuk.corejavaprojects.javadateandtime.beforejava8.calendar.problemsforpractice;

import java.util.Calendar;

/**
 * This is a solution to
 * 
 * Problem 1 found in https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to get and display information (year, month, day, hour, minute) of a default calendar. 
 * 
 * @author kingshuksmacbookpro
 *
 */
public class Problem2 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println("The year is: "+calendar.get(Calendar.YEAR));
		System.out.println("The month is: "+calendar.get(Calendar.MONTH));
		System.out.println("The day is: "+calendar.get(Calendar.DATE));
		System.out.println("The hour is: "+calendar.get(Calendar.HOUR));
		System.out.println("The minute is: "+calendar.get(Calendar.MINUTE));
		System.out.println("The seconds is: "+calendar.get(Calendar.SECOND));
		System.out.println("The complete time is: "+calendar.getTime());
	}

}
