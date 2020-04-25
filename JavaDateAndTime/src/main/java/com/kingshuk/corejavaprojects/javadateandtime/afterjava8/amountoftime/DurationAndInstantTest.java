package com.kingshuk.corejavaprojects.javadateandtime.afterjava8.amountoftime;

import java.time.Duration;
import java.time.Instant;

public class DurationAndInstantTest {

	public static void main(String[] args) throws InterruptedException {
		Instant now1 = Instant.now();
		System.out.println(now1);

		Thread.sleep(5000);

		Instant now2 = Instant.now();

		Duration duration = Duration.between(now1, now2);

		System.out.println(duration.toMillis());
		
		Instant now3 = Instant.now();
		
		System.out.println(now3.plus(duration));

	}

}
