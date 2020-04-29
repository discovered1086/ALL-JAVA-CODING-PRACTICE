package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.amountoftime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class USTravelHistoryPractice {

	private static final String MONTHS = " months";

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		String[] dates = { "2015-02-27", "2016-09-28", "2016-10-27", "2017-09-24", "2017-10-13", "2019-06-06",
				"2020-01-19" };

		LocalDate arrivalDate1 = LocalDate.parse(dates[0], formatter);

		LocalDate arrivalDate2 = LocalDate.parse(dates[2], formatter);

		LocalDate arrivalDate3 = LocalDate.parse(dates[4], formatter);

		LocalDate arrivalDate4 = LocalDate.parse(dates[6], formatter);

		LocalDate departureDate1 = LocalDate.parse(dates[1], formatter);

		LocalDate departureDate2 = LocalDate.parse(dates[3], formatter);

		LocalDate departureDate3 = LocalDate.parse(dates[5], formatter);

		Period lengthofStay1 = Period.between(arrivalDate1, departureDate1);

		// Period lengthofStay2 = Period.between(arrivalDate2, departureDate2);

		// Period lengthofStay3 = Period.between(arrivalDate3, departureDate3);

		// Period lengthofCurrentStay = Period.between(arrivalDate4, LocalDate.now());

		System.out.println("Length of first stay: " + ChronoUnit.MONTHS.between(arrivalDate1, departureDate1) + MONTHS);

		System.out
				.println("Length of second stay: " + ChronoUnit.MONTHS.between(arrivalDate2, departureDate2) + MONTHS);

		System.out.println("Length of third stay: " + ChronoUnit.MONTHS.between(arrivalDate3, departureDate3) + MONTHS);

		System.out.println(
				"Length of the current stay: " + ChronoUnit.MONTHS.between(arrivalDate4, LocalDate.now()) + MONTHS);

		Period periodOfPossibleStay = Period.ofYears(6);

		LocalDate maxOutDate = arrivalDate1.plus(periodOfPossibleStay)
				.plus(Period.between(departureDate1, arrivalDate2)).plus(Period.between(departureDate2, arrivalDate3))
				.plus(Period.between(departureDate3, arrivalDate4));

		long duration1 = departureDate1.until(arrivalDate2, ChronoUnit.DAYS);

		long duration2 = departureDate2.until(arrivalDate3, ChronoUnit.DAYS);

		long duration3 = departureDate3.until(arrivalDate4, ChronoUnit.DAYS);

		System.out.println("You have stayed " + (duration1 + duration2 + duration3) + " days outside of the US");

		LocalDate maxOutDate2 = arrivalDate1.plus(Period.ofYears(6)).plusDays(duration1 + duration2 + duration3);

		// System.out.println("Total number of days spent outside of US : " +
		// periodOutSideOfUS.getDays() + " days");

		System.out.println("Your H1B Max out date is: " + maxOutDate);

		System.out.println("Your H1B Max out date (By the second method) is: " + maxOutDate2);

	}

}
