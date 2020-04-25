package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ClockObjectPractice {

	public static void main(String[] args) {
		System.out.println("========================Instant===============================");
		System.out.println(Instant.now(Clock.systemDefaultZone()));

		System.out.println(Instant.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(Instant.now(Clock.systemUTC()));

		System.out.println("========================LocalDate===============================");

		System.out.println(LocalDate.now(Clock.systemDefaultZone()));

		System.out.println(LocalDate.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(LocalDate.now(Clock.systemUTC()));

		System.out.println("=========================LocalTime==============================");

		System.out.println(LocalTime.now(Clock.systemDefaultZone()));

		System.out.println(LocalTime.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(LocalTime.now(Clock.systemUTC()));

		System.out.println("=========================LocalDateTime===========================");

		System.out.println(LocalDateTime.now(Clock.systemDefaultZone()));

		System.out.println(LocalDateTime.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(LocalDateTime.now(Clock.systemUTC()));

		System.out.println("=========================OffsetTime==============================");

		System.out.println(OffsetTime.now(Clock.systemDefaultZone()));

		System.out.println(OffsetTime.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(OffsetTime.now(Clock.systemUTC()));

		System.out.println("========================OffsetDateTime============================");

		System.out.println(OffsetDateTime.now(Clock.systemDefaultZone()));

		System.out.println(OffsetDateTime.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(OffsetDateTime.now(Clock.systemUTC()));

		System.out.println("========================ZonedDateTime==============================");

		System.out.println(ZonedDateTime.now(Clock.systemDefaultZone()));

		System.out.println(ZonedDateTime.now(Clock.system(ZoneId.of("Asia/Kolkata"))));

		System.out.println(ZonedDateTime.now(Clock.systemUTC()));

	}

}
