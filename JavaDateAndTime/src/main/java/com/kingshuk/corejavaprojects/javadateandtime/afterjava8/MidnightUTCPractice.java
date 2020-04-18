package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class MidnightUTCPractice {

	public static void main(String[] args) {
		Instant instant = Instant.now().truncatedTo(ChronoUnit.SECONDS);

		System.out.println(instant);

		LocalDateTime localUTCDateTime = LocalDate.now().atStartOfDay();

		System.out.println(localUTCDateTime);

		OffsetDateTime midnighTime = OffsetDateTime.of(localUTCDateTime, ZoneOffset.UTC);

		System.out.println(midnighTime);

		OffsetDateTime midnightTime = OffsetDateTime.of(LocalDate.now(), LocalTime.MAX.truncatedTo(ChronoUnit.SECONDS),
				ZoneOffset.UTC);

		System.out.println(midnightTime);
		
		OffsetDateTime currentDateTime = OffsetDateTime
				.of(LocalDate.now(), LocalTime.MAX, ZoneOffset.UTC).truncatedTo(ChronoUnit.SECONDS);
		
		System.out.println(currentDateTime);

	}

}
