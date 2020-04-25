package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.amountoftime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodVsDurationPractice {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2019, Month.NOVEMBER.getValue(), 03, 01, 30, 0, 0);

		LocalDateTime dt2 = LocalDateTime.of(2020, Month.MARCH.getValue(), 8, 01, 30, 0, 0);

		LocalDateTime dt3 = dt.plusDays(1l);

		LocalDateTime dt4 = dt2.plusDays(1l);

		System.out.println(Duration.between(dt, dt3));

		System.out.println(Period.between(dt.toLocalDate(), dt3.toLocalDate()));

	}

}
