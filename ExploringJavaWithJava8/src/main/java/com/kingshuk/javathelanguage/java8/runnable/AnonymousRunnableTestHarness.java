package com.kingshuk.javathelanguage.java8.runnable;

public class AnonymousRunnableTestHarness {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the parent thread");
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        /**
         * This is an example of how lambda expressions can be used 
         * as anonymous inner classes. The conventional way of doing 
         * it would have been to write new Runnable() inside the
         * constructor of the Thread instance. We no longer need to 
         * do that while using the lambda expression
         */
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("This is the Child thread");
                try {
                    Thread.sleep(600);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
