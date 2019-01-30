package com.kingshuk.multithreading.threadprogramming.threadingin2017.yield;

/**
 * Created by kingshuk on 10/30/17.
 */
public class InterruptTest {

    public static void main(String[] args) {
        JustPrintingInterrupt t1=new JustPrintingInterrupt();
        t1.setName("Interrupt Demo Thread");
        t1.start();

        Thread.currentThread().setName("Main Thread");

        t1.interrupt();   //We can only interrupt a thread that's in sleep. If a thread is actively running,
                            //We can't interrupt it.

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing " + i);
        }
    }
}
