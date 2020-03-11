package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ParticularTimeOfDayTest {

	public static void main(String[] args) {
		LocalDateTime startOfDay = LocalDate.now().atStartOfDay();

		System.out.println(startOfDay);

		ZonedDateTime startOfTheDay = LocalDate.now().atStartOfDay(ZoneId.of("Europe/Paris"));

		System.out.println(startOfTheDay);

		OffsetDateTime dateTime = OffsetDateTime.of(LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT),
				ZoneOffset.of("-5"));
		
		System.out.println(dateTime);
	}

}
