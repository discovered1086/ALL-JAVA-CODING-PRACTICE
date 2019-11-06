package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class USTravelHistoryPractice {

	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

		String[] dates = { "2015-02-27", "2016-09-28", "2016-10-27", "2017-09-24", "2017-10-13", "2019-06-06" };

		LocalDate arrivalDate1 = LocalDate.parse(dates[0], formatter);

		LocalDate arrivalDate2 = LocalDate.parse(dates[2], formatter);

		LocalDate arrivalDate3 = LocalDate.parse(dates[4], formatter);

		LocalDate departureDate1 = LocalDate.parse(dates[1], formatter);

		LocalDate departureDate2 = LocalDate.parse(dates[3], formatter);

		LocalDate departureDate3 = LocalDate.parse(dates[5], formatter);

		Period lengthofStay1 = Period.between(arrivalDate1, departureDate1);

		Period lengthofStay2 = Period.between(arrivalDate2, departureDate2);

		Period lengthofStay3 = Period.between(arrivalDate3, departureDate3);

		System.out.println(
				"Length of first stay: " + (lengthofStay1.getYears() * 12 + lengthofStay1.getMonths()) + " months");

		System.out.println(
				"Length of second stay: " + (lengthofStay2.getYears() * 12 + lengthofStay2.getMonths()) + " months");

		System.out.println(
				"Length of third stay: " + (lengthofStay3.getYears() * 12 + lengthofStay3.getMonths()) + " months");

	}

}
