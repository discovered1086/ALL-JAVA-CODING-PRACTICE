package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateFormatting {

	public static void main(String[] args) {
		ZoneId nyZoneId = ZoneId.of("America/New_York");

		ZonedDateTime nydDateTime = ZonedDateTime.now(nyZoneId);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:MM:SS a");

		System.out.println(nydDateTime.format(formatter));

		System.out.println(ZonedDateTime.now().format(formatter));

		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MMMM-yyyy");

		System.out.println(nydDateTime.format(formatter2));

		System.out.println(ZonedDateTime.now().format(formatter2));

	}

}
