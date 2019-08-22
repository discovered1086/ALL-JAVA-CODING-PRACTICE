package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;


public class BasicDateTimePractice {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		System.out.println(date);
		
		LocalTime localTime = LocalTime.now();
		
		System.out.println(localTime);
		
		int day = date.getDayOfMonth();
		
		System.out.println(day);
		
		int month = date.getMonthValue();
		
		System.out.println(month);
		
		Month month2 = date.getMonth();
		
		System.out.println(month2);
		
		int year = date.getYear();
		
		System.out.println(year);
		
		System.out.printf("%d/%d/%d",day, month, year);
	}

}
