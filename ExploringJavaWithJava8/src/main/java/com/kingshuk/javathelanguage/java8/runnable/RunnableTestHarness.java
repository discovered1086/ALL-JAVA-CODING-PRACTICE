package com.kingshuk.javathelanguage.java8.runnable;

public class RunnableTestHarness {

    public static void main(String[] args) {
    	
    	Runnable myRunnable=()-> {
            for (int i = 0; i < 10; i++) {
                System.out.println("This is the Child thread");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(myRunnable).start();
        
        
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the parent thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        
    }
}
