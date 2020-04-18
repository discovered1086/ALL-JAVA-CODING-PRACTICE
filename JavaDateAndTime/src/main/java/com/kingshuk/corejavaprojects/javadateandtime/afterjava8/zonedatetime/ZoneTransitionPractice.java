package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.zonedatetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.zone.ZoneOffsetTransition;
import java.util.Objects;

public class ZoneTransitionPractice {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/Chicago");

		LocalDateTime dt = LocalDateTime.of(2019, 
				Month.NOVEMBER.getValue(), 03, 01, 30, 0, 0);

		System.out.println(dt);

		ZoneOffsetTransition trn = zone.getRules().getTransition(dt);

		if (Objects.nonNull(trn)) {
			System.out.println(trn.isGap() ? "It's a gap" : 
				trn.isOverlap() ? "It's an overlap" : "It's nothing");
		}
		
		LocalDateTime dt2 = LocalDateTime.of(2020, 
				Month.MARCH.getValue(), 8, 01, 30, 0, 0);
		
		System.out.println(dt2);
		
		ZoneOffsetTransition trn2 = zone.getRules().getTransition(dt2);

		if (Objects.nonNull(trn2)) {
			System.out.println(trn2.isGap() ? "It's a gap" : 
				trn2.isOverlap() ? "It's an overlap" : "It's nothing");
		}
		
		
		LocalDateTime dt3 = LocalDateTime.of(2020, 
				Month.MARCH.getValue(), 8, 02, 30, 0, 0);
		
		System.out.println(dt3);
		
		ZoneOffsetTransition trn3 = zone.getRules().getTransition(dt3);

		if (Objects.nonNull(trn3)) {
			System.out.println(trn3.isGap() ? "It's a gap" : 
				trn3.isOverlap() ? "It's an overlap" : "It's nothing");
		}
	}

}
