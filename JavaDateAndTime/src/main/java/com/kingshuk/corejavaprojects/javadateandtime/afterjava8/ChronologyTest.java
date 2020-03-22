package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.chrono.Chronology;
import java.time.chrono.JapaneseDate;
import java.util.Locale;

public class ChronologyTest {

	public static void main(String[] args) {
		Locale locale = Locale.forLanguageTag("th-TH-u-ca-buddhist");

		Chronology chronology = Chronology.ofLocale(locale);

		ChronoLocalDate localDate = chronology.date(LocalDate.now());

		System.out.println("The date in buddhist calendar is: " + localDate);

		System.out.println("The date in japanese calendar is: " + JapaneseDate.now());

		for (String string : Locale.getISOLanguages()) {
			System.out.println(string);
		}

		for (Locale locale2 : Locale.getAvailableLocales()) {
			System.out.println(locale2);
		}

		Locale locale2 = Locale.forLanguageTag("en");

		Chronology chronology2 = Chronology.ofLocale(locale2);

		System.out.println(chronology2.dateNow());

	}

}
