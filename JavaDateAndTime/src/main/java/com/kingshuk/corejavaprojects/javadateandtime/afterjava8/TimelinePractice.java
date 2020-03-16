package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class TimelinePractice {
	public static void main(String[] args) {
		System.out.println(Instant.now().truncatedTo(ChronoUnit.SECONDS));

		System.out.println(OffsetDateTime.now().truncatedTo(ChronoUnit.SECONDS));
		
		ZonedDateTime nowDateTime = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS);

		System.out.println(nowDateTime);
		
		System.out.println(nowDateTime.toOffsetDateTime());
		
		ZonedDateTime dateTime = ZonedDateTime.now().truncatedTo(ChronoUnit.SECONDS).withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		
		System.out.println(dateTime);
		
		System.out.println(dateTime.toOffsetDateTime());
	}
}
