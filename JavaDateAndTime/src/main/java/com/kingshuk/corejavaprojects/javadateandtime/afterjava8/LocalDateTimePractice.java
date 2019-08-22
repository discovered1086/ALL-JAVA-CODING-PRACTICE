package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimePractice {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		
		System.out.println(dt);
		
		//Now let's print the time of any zone
		//Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		
		//availableZoneIds.forEach(zone -> System.out.println(zone +"\n"));
		
		LocalDateTime dtus = LocalDateTime.now(ZoneId.of("US/Central"));
		
		System.out.println(dtus);
	}

}
