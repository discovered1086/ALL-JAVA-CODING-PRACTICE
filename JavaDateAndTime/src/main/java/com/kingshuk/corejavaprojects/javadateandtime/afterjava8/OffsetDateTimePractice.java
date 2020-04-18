package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class OffsetDateTimePractice {

	public static void main(String[] args) {
		ZonedDateTime dateTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));

		System.out.println(dateTime);

		System.out.println(dateTime.toOffsetDateTime());

		ZonedDateTime kolkataTime = ZonedDateTime.parse("2020-04-20T00:00:00+05:30",
				DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		
		System.out.println(kolkataTime.withZoneSameInstant(ZoneId.systemDefault()));
	}

}
