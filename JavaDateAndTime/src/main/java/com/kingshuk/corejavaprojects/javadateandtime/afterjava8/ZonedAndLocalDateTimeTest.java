package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedAndLocalDateTimeTest {

	public static void main(String[] args) {
		ZonedDateTime subCategoryEffectiveDate = ZonedDateTime.now();

		String effectiveDate = subCategoryEffectiveDate.format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		
		System.out.println(effectiveDate);
		
		System.out.println(OffsetDateTime.now());
		
		System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault()));
	}

}
