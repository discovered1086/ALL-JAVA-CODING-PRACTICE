package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DiscoverProjectCodeCheck {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

	public static void main(String[] args) {
		System.out.println("The mock value is: " + mockDateValue(0));
		
		System.out.println("The QA value is: "+qaDateValue(0));
	}

	private static String mockDateValue(int iDays) {
		ZonedDateTime localDateTime = LocalDateTime.now().atZone(ZoneId.of("UTC")).minusDays(iDays).withHour(06)
				.withMinute(00).withSecond(01).withNano(00);
		return localDateTime.format(FORMATTER);
	}

	private static String qaDateValue(int iDays) {
		ZonedDateTime zdt = ZonedDateTime.now(ZoneId.of("UTC")).withHour(06).withMinute(00).withSecond(01).withNano(00)
				.minusDays(iDays);
		return zdt.withZoneSameInstant(ZoneId.of("America/New_York")).format(FORMATTER);
	}

}
