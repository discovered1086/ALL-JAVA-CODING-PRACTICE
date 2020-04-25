package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.combiningelements;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class CombiningElementsPractice {

	public static void main(String[] args) {
		LocalDate date = Year.of(2013).atMonth(2).atDay(16);

		System.out.println(date);

		LocalDateTime dateTime = date.atTime(12, 30);

		System.out.println(dateTime);

		OffsetDateTime offsetDateTime = dateTime.atOffset(ZoneOffset.ofHours(-5));

		System.out.println(offsetDateTime);

		ZonedDateTime zonedDateTime = date.atStartOfDay(ZoneId.of("Asia/Kolkata"));

		System.out.println(zonedDateTime);
	}

}
