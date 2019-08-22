package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeForSpecificDatePractice {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2018, 8, 27, 10, 20);
		
		System.out.println(dt);
		
		LocalDateTime dt1 = LocalDateTime.of(2018, Month.AUGUST, 27,10,20);
		
		System.out.println(dt1);
	}

}
