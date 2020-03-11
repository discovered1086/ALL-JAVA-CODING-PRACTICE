package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeTest {

	public static void main(String[] args) {
		OffsetDateTime offsetDateTime = OffsetDateTime.now();
		System.out.println(offsetDateTime);
		
		offsetDateTime = offsetDateTime.truncatedTo(ChronoUnit.SECONDS);
		
		System.out.println(offsetDateTime);
		
		offsetDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.of("+5"));
		
		System.out.println(offsetDateTime);

		offsetDateTime = offsetDateTime.with(ChronoField.HOUR_OF_DAY, 0);
		
		System.out.println(offsetDateTime);
		
		LocalDateTime startOfDay = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
		
		System.out.println(startOfDay);
		
		offsetDateTime = OffsetDateTime.of(startOfDay, offsetDateTime.getOffset());
		
		System.out.println(offsetDateTime.truncatedTo(ChronoUnit.SECONDS));
		
		System.out.println(ZonedDateTime.now());
		
		
	}

}
