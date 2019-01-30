package com.kingshuk.multithreading.threadprogramming.threadingin2017;

/**
 * Created by kingshuk on 10/30/17.
 */
public class RunnableTest {

    public static void main(String[] args) {
        JustPrinting justPrinting=new JustPrinting();

        Thread t1=new Thread(justPrinting, "First Account");

        Thread t2=new Thread(justPrinting, "Second Account");

        t1.start();

        t2.start();
    }
}
