package com.kingshuk.multithreading.threadprogramming.threadingin2017.yield;

/**
 * Created by kingshuk on 10/30/17.
 */
public class JustPrintingInterrupt extends Thread {
    @Override
    public void run() {

        try {
            for (int i = 0; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + " is printing " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Got interrupted by Main Thread");
        }
    }
}
