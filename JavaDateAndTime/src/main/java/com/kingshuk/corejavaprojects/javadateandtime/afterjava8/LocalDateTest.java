package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		System.out.println(localDate);

		LocalDate localDate2 = LocalDate.of(2018, Month.DECEMBER, 10);

		System.out.println(localDate2);

		System.out.println("Is " + localDate + " before " + localDate2 + "? " + localDate.isBefore(localDate2));

		System.out.println("Is the current year a leap year? " + localDate.isLeapYear());

		System.out.println("The current month has " + localDate.lengthOfMonth() + " days");
		
		System.out.println("today's date after modification "+ localDate.plusDays(23).minusMonths(1l));
	}

}
