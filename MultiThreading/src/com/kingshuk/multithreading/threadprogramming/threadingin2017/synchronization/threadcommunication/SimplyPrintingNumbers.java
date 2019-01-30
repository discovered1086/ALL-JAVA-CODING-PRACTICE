package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.threadcommunication;

public class SimplyPrintingNumbers {


    public void printOddNumbers() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " is printing " + i);
                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
           //notify();
        }

    }

    public void printEvenNumbers() {
        synchronized (this) {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " is printing " + i);
                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
