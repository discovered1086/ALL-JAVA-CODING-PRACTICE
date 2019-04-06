package com.kingshuk.corejavaprojects.javadateandtime.beforejava8.calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class SettingAndFetchingCalendarPropertiesTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();

		cal.set(Calendar.DAY_OF_WEEK, 2);

		GregorianCalendar calendar = new GregorianCalendar();

		calendar.set(Calendar.MONTH, Calendar.DECEMBER);

		System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(calendar.getTime()));

		System.out.println(new SimpleDateFormat("MM/dd/yyyy").format(cal.getTime()));
	}

}
