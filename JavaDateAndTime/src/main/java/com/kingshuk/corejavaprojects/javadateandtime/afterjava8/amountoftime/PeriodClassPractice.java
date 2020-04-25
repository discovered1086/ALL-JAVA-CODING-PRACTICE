package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.amountoftime;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodClassPractice {

	public static void main(String[] args) {
		//Calculating age
		LocalDate birthDate = LocalDate.of(1986, Month.OCTOBER, 16);
		
		Period p = Period.between(birthDate, LocalDate.now());
		
		System.out.println(p);
		
		System.out.printf("My age is %d years %d months and %d days",
				p.getYears(), p.getMonths(), p.getDays());
	}

}
