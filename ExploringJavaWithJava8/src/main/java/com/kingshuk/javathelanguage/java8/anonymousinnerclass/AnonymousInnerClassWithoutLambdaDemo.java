package com.kingshuk.javathelanguage.java8.anonymousinnerclass;

public class AnonymousInnerClassWithoutLambdaDemo {

	public static void main(String[] args) {
		
		Runnable runnable = new Runnable() {
			public void run() {
				for(int i=0; i<=10; i++) {
					System.out.println("This is the child thread: "+i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread childThread1 = new Thread(runnable);
		childThread1.start();
		
		for(int i=0; i<=10; i++) {
			System.out.println("This is the parent thread: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
