package com.kingshuk.corejavaprojects.javadateandtime.beforejava8.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SimpleDateArithmaticTest {

	public static void main(String[] args) {
		String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thusday",
		        "Friday", "Saturday" };
		
		Calendar cal = Calendar.getInstance();
		
		//Want to get the calendar instance representing the day, 15 days from now
		cal.add(Calendar.DATE, 15);
		
		System.out.println("The date is "+ new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
		
		System.out.println("Day of the week is "+ strDays[cal.get(Calendar.DAY_OF_WEEK)-1]);
	}

}
