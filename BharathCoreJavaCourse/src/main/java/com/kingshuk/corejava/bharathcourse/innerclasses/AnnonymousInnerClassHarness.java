package com.kingshuk.corejava.bharathcourse.innerclasses;

public class AnnonymousInnerClassHarness {

	public static void main(String[] args) throws InterruptedException {

		Runnable target = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Inside runnable " + i);
				}
			}
		};

		Thread t = new Thread(target);
		t.start();

		for (int i = 0; i < 5; i++) {
			System.out.println("Inside Main class " + i);
		}

		Thread.sleep(2000);
	}

}
