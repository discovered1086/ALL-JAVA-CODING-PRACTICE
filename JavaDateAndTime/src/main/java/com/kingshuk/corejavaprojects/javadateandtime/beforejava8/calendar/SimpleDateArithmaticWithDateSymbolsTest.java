package com.kingshuk.corejavaprojects.javadateandtime.beforejava8.calendar;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateArithmaticWithDateSymbolsTest {

	public static void main(String[] args) {
		/*String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
		        "Friday", "Saturday" };*/
				
		Calendar cal = Calendar.getInstance();
		
		//Want to get the calendar instance representing the day, 15 days from now
		cal.add(Calendar.DATE, 15);
		
		System.out.println("The date is "+ new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
		
		
		/*
		 * Another way to get the weekday without having to define an array is to 
		 * use the DateFormatSymbols class from java.text package
		 */
		DateFormatSymbols symbols = new DateFormatSymbols();
		
		System.out.println("Day of the week is "+ symbols.getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)]);
	}

}
