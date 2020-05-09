package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class OffsetDateTimeCheck {

	public static void main(String[] args) {
		OffsetDateTime timeNow = OffsetDateTime.ofInstant(Instant.now(), ZoneId.of("UTC"))
				.truncatedTo(ChronoUnit.MINUTES);
		System.out.println(
				"The date time being set in the filter is: " + timeNow.format(DateTimeFormatter.ofPattern("yyyy-mm-dd'T'hh:mm:ssZ")));
	}

}
