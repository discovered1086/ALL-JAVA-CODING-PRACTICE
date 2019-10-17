package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class MoreZonedDateTimePractice {

	public static void main(String[] args) {
		ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println(zonedDateTime);
		
		//Get zone id from zoned date time
		ZoneId zoneId = zonedDateTime.getZone();
		
		System.out.println(zoneId);
		
		LocalDate localDate = LocalDate.now(zoneId);
		
		System.out.println(localDate);
	}

}
