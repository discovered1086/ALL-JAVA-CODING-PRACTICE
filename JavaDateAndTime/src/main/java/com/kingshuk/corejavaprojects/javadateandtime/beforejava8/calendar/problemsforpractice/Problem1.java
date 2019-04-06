package com.kingshuk.corejavaprojects.javadateandtime.beforejava8.calendar.problemsforpractice;

import java.util.Calendar;
import java.util.Date;

/**
 * This is a solution to
 * 
 * Problem 1 found in https://www.w3resource.com/java-exercises/datetime/index.php
 * 
 * Write a Java program to create a Date object using the Calendar class. 
 * 
 * @author kingshuksmacbookpro
 *
 */
public class Problem1 {
	public static void main(String[] args) {
		Date date = Calendar.getInstance().getTime();
		
		System.out.println(date);
	}
}
