package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.threadcommunication;

public class InterThreadCommunicationHarness {

    public static void main(String[] args) {
        /*InterThreadCommunicationThread theTask=new InterThreadCommunicationThread();
        theTask.setSimplyPrintingNumbers(new SimplyPrintingNumbers());

        Thread t1=new Thread(theTask);
        Thread t2=new Thread(theTask);*/

        final SimplyPrintingNumbers simplyPrintingNumbers = new SimplyPrintingNumbers();

        Thread t1 = new Thread(new Runnable() {

            @Override
            public void run() {
                synchronized (simplyPrintingNumbers) {
                    simplyPrintingNumbers.printEvenNumbers();
                    try {
                        simplyPrintingNumbers.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    simplyPrintingNumbers.printOddNumbers();
                }

            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (simplyPrintingNumbers) {
                    simplyPrintingNumbers.printEvenNumbers();
                    simplyPrintingNumbers.notify();
                    simplyPrintingNumbers.printOddNumbers();
                }

            }
        });

        t1.start();
        t2.start();

    }
}
