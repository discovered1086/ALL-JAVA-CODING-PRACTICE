package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDateTime;

public class LocalDateTimeForDateCalculationPractice {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2018, 8, 27, 10, 20);
		
		System.out.println(dt);
		
		System.out.println("Date after 6 months: "+dt.plusMonths(6));
		
		System.out.println("Date after 23 days: "+dt.plusDays(23));
		
		System.out.println("Date after 15 years: "+dt.plusYears(15));
		
		System.out.println("Date after 11 weeks: "+dt.plusWeeks(11));
	}

}
