package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.calculations;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateInFuture {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the date to be entered: \n");

		String next = scanner.next();

		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

		System.out.println(zonedDateTime);

		System.out.println("Date " + next + " days later, is: "
				+ zonedDateTime.plusDays(Long.parseLong(next)).format(DateTimeFormatter.ISO_OFFSET_DATE));

		scanner.close();
	}

}
