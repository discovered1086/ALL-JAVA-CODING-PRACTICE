package com.kingshuk.corejavaprojects.javadateandtime.beforejava8;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarClassPracticeHarness {

	public static void main(String[] args) {
		Calendar calendar= Calendar.getInstance(TimeZone.getTimeZone("Asia/Karachi"));
		
		System.out.println(calendar.getTime().toString());
		
		System.out.println(calendar.getTimeZone());
	}

}
