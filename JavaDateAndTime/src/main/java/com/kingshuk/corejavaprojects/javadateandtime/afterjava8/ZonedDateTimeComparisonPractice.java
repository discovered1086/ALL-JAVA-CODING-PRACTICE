package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeComparisonPractice {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		
		
		String value1 = ZonedDateTime.now().format(formatter);
		
		String value2 = ZonedDateTime.now().format(formatter);
		
		System.out.println(String.format("%s %s", value1, value2));
		
		System.out.println(value1.equals(value2));
		
		ZonedDateTime now = ZonedDateTime.now();
		
		ZonedDateTime now2 = ZonedDateTime.now();
		
		System.out.println(String.format("%s %s", now, now2));
		
		System.out.println(now.equals(now2));
	}

}
