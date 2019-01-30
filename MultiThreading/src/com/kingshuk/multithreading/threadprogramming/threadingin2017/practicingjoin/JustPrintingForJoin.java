package com.kingshuk.multithreading.threadprogramming.threadingin2017.practicingjoin;

/**
 * Created by kingshuk on 8/4/17.
 */
public class JustPrintingForJoin extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+" is printing "+i);
        }
    }
}
