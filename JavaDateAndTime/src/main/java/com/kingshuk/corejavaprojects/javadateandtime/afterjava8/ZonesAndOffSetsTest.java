package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class ZonesAndOffSetsTest {

	public static void main(String[] args) {
		// Kolkata time using offsets
		OffsetDateTime sameInstant = OffsetDateTime.now().withOffsetSameInstant(ZoneOffset.ofHoursMinutes(05, 30));

		System.out.println("Using offsets: " + sameInstant.truncatedTo(ChronoUnit.SECONDS));

		System.out.println(
				"Using zone id: " + OffsetDateTime.now(ZoneId.of("Asia/Kolkata")).truncatedTo(ChronoUnit.SECONDS));
	}

}
