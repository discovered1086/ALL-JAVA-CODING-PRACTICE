package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Instant;

public class InstantPractice {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Instant.now());
		
		Thread.sleep(15);
		
		System.out.println(Instant.now());
		
		
	}

}
