package com.kingshuk.corejavaprojects.javadateandtime.beforejava8;

import java.sql.Date;

public class BasicSqlDateObjectTestHarness {
	
	public static void main(String[] args) {
		Date date = new Date(System.currentTimeMillis());
		
		System.out.println("Current date is: "+date);
		
		/*Date date2 = Date.valueOf("02/11/2018");
		
		System.out.println("The date converted from string is: "+date2);*/
	}
}
