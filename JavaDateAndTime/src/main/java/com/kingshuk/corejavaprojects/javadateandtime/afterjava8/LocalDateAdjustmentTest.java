package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateAdjustmentTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		System.out.println("Current date: " + localDate);

		System.out.println("Last day of this month: " + localDate.with(TemporalAdjusters.lastDayOfMonth()));

		System.out.println("The date next Tuesday is: " + localDate.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));

		System.out.println("The Friday two weeks later is: "
				+ localDate.with(TemporalAdjusters.dayOfWeekInMonth(-2, DayOfWeek.FRIDAY)));
	}

}
