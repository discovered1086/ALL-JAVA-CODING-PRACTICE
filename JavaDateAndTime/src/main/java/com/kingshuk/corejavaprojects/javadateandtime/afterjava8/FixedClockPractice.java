package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class FixedClockPractice {

	public static void main(String[] args) {
		Clock clock = Clock.fixed(Instant.now(), ZoneId.of("Asia/Kolkata"));

		System.out.println(clock);

		System.out.println(LocalDateTime.now(clock));
		
		System.out.println(OffsetDateTime.now(clock));
		
		System.out.println(ZonedDateTime.now(clock));
	}

}
