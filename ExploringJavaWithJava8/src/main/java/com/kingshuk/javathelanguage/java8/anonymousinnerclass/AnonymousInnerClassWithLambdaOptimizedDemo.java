package com.kingshuk.javathelanguage.java8.anonymousinnerclass;

public class AnonymousInnerClassWithLambdaOptimizedDemo {

	public static void main(String[] args) {
		
		Thread childThread1 = new Thread(()->{
			for(int i=0; i<=10; i++) {
				System.out.println("This is the child thread using lambda optimized: "+i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
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
