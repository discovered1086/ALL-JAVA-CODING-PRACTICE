package com.kingshuk.corejavaprojects.javadateandtime.beforejava8;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsingCurrentTimeInMillisForDuration {
	private long startTime;
	private long endTime;

	public static void main(String[] args) {
		
		UsingCurrentTimeInMillisForDuration durationTest = new UsingCurrentTimeInMillisForDuration();
		
		durationTest.start();
		
		for (int i = 0; i < 15; i++) {
			System.out.println("printing the number: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}
		
		durationTest.stop();
		
		durationTest.printDuration();
	}
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public void printDuration() {
		System.out.println("The time taken by the task was "+(this.getEndTime() - this.getStartTime())+" ms");
	}

}
