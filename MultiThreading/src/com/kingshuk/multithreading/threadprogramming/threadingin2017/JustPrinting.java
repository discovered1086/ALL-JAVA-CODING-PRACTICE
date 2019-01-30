package com.kingshuk.multithreading.threadprogramming.threadingin2017;

/**
 * Created by kingshuk on 8/4/17.
 */
public class JustPrinting extends Thread {
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" is printing "+i);
        }
    }
}
