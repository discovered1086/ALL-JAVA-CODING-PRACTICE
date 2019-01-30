package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.locksondifferentobject;

public class PlayWithNumbersHarness {
    public static void main(String[] args) {
        //PlayWithNumbers playWithNumbers=new PlayWithNumbers();
        //PlayWithNumbers playWithNumbers2=new PlayWithNumbers();
        PlayWithNumbersSyncBlocks playWithNumbers=new PlayWithNumbersSyncBlocks();
        //Thread t1=new Thread(new PlayWithNumbersThread(playWithNumbers));
        //Thread t2=new Thread(new PlayWithNumbersThread(playWithNumbers));
        Thread t1=new Thread(new PlayWithNumbersThreadSyncBlocks(playWithNumbers));
        Thread t2=new Thread(new PlayWithNumbersThreadSyncBlocks(playWithNumbers));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("The final value of the counter is "+playWithNumbers.getCounter());

    }
}
