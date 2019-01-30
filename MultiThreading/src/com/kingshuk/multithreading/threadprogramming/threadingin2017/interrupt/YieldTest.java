package com.kingshuk.multithreading.threadprogramming.threadingin2017.interrupt;

/**
 * Created by kingshuk on 10/30/17.
 */
public class YieldTest {

    public static void main(String[] args) {
        JustPrintingYield yieldDemo=new JustPrintingYield();

        Thread t1=new Thread(yieldDemo, "Yield Demo Thread");
        t1.start();

        Thread.currentThread().setName("Main Thread");

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " is printing " + i);
        }
    }
}
