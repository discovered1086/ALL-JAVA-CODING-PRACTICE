package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateTimePractice {

	public static void main(String[] args) {
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("YYYY-MM-dd'T'hh:mm:ss a");
		LocalDateTime dt = LocalDateTime.now();

		System.out.println(dt);

		// Now let's print the time of any zone
		// Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

		// availableZoneIds.forEach(zone -> System.out.println(zone +"\n"));

		LocalDateTime dtus = LocalDateTime.now(ZoneId.of("US/Central"));

		System.out.println(dtus.format(dateTimeFormatter));

		// Local date and time in Kolkata
		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")).format(dateTimeFormatter));

		// same time in Kolkata next Friday
		System.out.println(LocalDateTime.now(ZoneId.of("Asia/Kolkata")).with(TemporalAdjusters.next(DayOfWeek.FRIDAY))
				.format(dateTimeFormatter));
	}

}
