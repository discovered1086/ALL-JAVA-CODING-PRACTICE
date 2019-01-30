package com.kingshuk.multithreading.threadprogramming.threadingin2017;

/**
 * Created by kingshuk on 8/4/17.
 */
public class MultiThreadingTest {

    public static void main(String[] args) throws InterruptedException {
        Thread t1=new JustPrinting();
        t1.join();
        /*
        What the join method does is the thread on which it's called, it makes sure that thread runs to completion
        before any other thread can actually step in. it blocks other threads till the thread on which it's called,
        runs to completion.
         */
        //t1.setPriority(2);
        t1.start();

        /*
        The priorities of the thread are incremental. A higher number represents higher priority and vice versa.
        There's no guarantee that the JVM will respect the assignment of priorities. But in most scenarios it does.
         */
        Thread t2=new JustPrinting();
        //t2.setPriority(1);
        t2.start();
    }
}
