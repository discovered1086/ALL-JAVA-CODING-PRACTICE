package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.combiningelements;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class LocalDateTimeVsInstanceInDifferentTZ {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();

		System.out.println(localDateTime);

		ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Asia/Kolkata"));

		System.out.println(zonedDateTime);

		ZonedDateTime zonedDateTime2 = ZonedDateTime.of(localDateTime, ZoneId.of("America/Chicago"));

		System.out.println(zonedDateTime2);

		ZonedDateTime zoneSameInstant = zonedDateTime2.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

		System.out.println(zoneSameInstant);
		
		ZonedDateTime zoneSameInstant2 = zonedDateTime2.withZoneSameLocal(ZoneId.of("Asia/Kolkata"));

		System.out.println(zoneSameInstant2);

		ZonedDateTime ofInstant = ZonedDateTime.ofInstant(localDateTime.toInstant(ZoneOffset.ofHoursMinutes(05, 00)),
				ZoneId.of("America/Chicago"));

		System.out.println(ofInstant);

		ZonedDateTime zoneSameInstant3 = ofInstant.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

		System.out.println(zoneSameInstant3);
	}

}
