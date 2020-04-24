package com.kingshuk.corejavaprojects.javadateandtime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class InstantDateTimeTest {

	public static void main(String[] args) {
		LocalDateTime currentDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"));
		
		System.out.println(currentDateTime);
		
		System.out.println(LocalDateTime.now(ZoneId.of("UTC")));
		
		LocalDateTime currentTime = LocalDateTime.now();
		
		System.out.println(currentTime);
		
		LocalDateTime now = LocalDateTime.of(LocalDate.now(), LocalTime.MIDNIGHT);
		
		System.out.println(now);
		
	}

}
