package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneIdPractice {

	public static void main(String[] args) {
		//How do we know which current time zone we're in?
		ZoneId zoneId = ZoneId.systemDefault();
		
		System.out.println(zoneId);
		
		/*
		 * Now how we do we know what's the time in New York?
		 * 
		 * We first create a ZoneId object and then use it to get the zoned date time
		 */
		
		ZoneId nyZoneId = ZoneId.of("America/New_York");
		
		ZonedDateTime nydDateTime = ZonedDateTime.now(nyZoneId);
		
		System.out.println(nydDateTime);
		
	}

}
