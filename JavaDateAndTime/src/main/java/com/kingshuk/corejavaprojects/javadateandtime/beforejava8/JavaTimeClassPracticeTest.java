package com.kingshuk.corejavaprojects.javadateandtime.beforejava8;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class JavaTimeClassPracticeTest {

	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		
		Timestamp timeStamp = new Timestamp(time);
		
		timeStamp.setNanos(54896);
		
		System.out.println(timeStamp);
		
		Time timeObj = new Time(time);
		
		System.out.println(timeObj);
		
		Date dateObj = new Date(time);
		
		System.out.println(dateObj);
	}

}
