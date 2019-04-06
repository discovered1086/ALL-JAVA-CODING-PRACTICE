package com.kingshuk.corejavaprojects.javadateandtime.beforejava8.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class BasicGregorianCalendarExample {

	public static void main(String[] args) {
		//Setting up the current date and time using gregorian calendar
		Calendar cal = Calendar.getInstance();
		
		GregorianCalendar calendar = new GregorianCalendar();
		
		System.out.println(calendar);
		
		System.out.println(cal);
	}

}
