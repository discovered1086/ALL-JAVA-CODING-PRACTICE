package com.kingshuk.multithreading.threadprogramming.threadingin2017.interrupt;

/**
 * Created by kingshuk on 10/30/17.
 */
public class JustPrintingYield implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing " + i);
            Thread.yield();
        }
    }
}
