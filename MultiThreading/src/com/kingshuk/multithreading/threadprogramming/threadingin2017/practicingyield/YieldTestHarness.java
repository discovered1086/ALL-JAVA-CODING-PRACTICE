package com.kingshuk.multithreading.threadprogramming.threadingin2017.practicingyield;

public class YieldTestHarness {
    public static void main(String[] args) {
        Thread t1=new Thread(new YieldTest());
        Thread t2=new Thread(new YieldTest());

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        System.out.println("Done my work in main thread");
    }
}
