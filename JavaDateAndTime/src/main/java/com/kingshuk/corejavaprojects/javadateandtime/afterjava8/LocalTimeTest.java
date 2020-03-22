package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalTimeTest {
	public static void main(String[] args) {
		System.out.println(LocalTime.now());

		System.out.println(LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss a")));

		System.out.println(LocalTime.now().truncatedTo(ChronoUnit.SECONDS));

		System.out.println("Local time in Kolkata is: "
				+ LocalTime.now(ZoneId.of("Asia/Kolkata")).format(DateTimeFormatter.ofPattern("hh:mm:ss a")));
	}
}
