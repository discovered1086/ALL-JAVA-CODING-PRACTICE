package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.zonedatetime;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Class meant for Zone gaps and overlaps practice
 * 
 * @author kingshuksmacbookpro
 *
 */
public class ZonedDateTimePractice {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/Chicago");

		ZonedDateTime dt = ZonedDateTime.of(2019, Month.NOVEMBER.getValue()
				, 03, 01, 30, 0, 0, zone);
		
		System.out.println(dt);
		
		dt = dt.plusHours(1l);
		
		System.out.println("An hour later: "+dt);
		
		ZonedDateTime dt2 = ZonedDateTime.of(2020, Month.MARCH.getValue()
				, 8, 01, 30, 0, 0, zone);
		
		System.out.println("=====================================================");
		
		System.out.println(dt2);
		
		dt2 = dt2.plusHours(1l);
		
		System.out.println("An hour later: "+dt2);
	}

}
