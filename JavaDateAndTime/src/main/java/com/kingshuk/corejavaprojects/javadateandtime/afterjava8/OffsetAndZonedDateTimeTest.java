package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalTime;
import java.time.ZonedDateTime;

public class OffsetAndZonedDateTimeTest {

	public static void main(String[] args) {
		ZonedDateTime dateTime = ZonedDateTime.parse("2020-11-25T00:00:00+05:30[Asia/Kolkata]")
				.with(LocalTime.MIDNIGHT);

		System.out.println(dateTime);
		
		System.out.println(dateTime.toOffsetDateTime());
	}

}
