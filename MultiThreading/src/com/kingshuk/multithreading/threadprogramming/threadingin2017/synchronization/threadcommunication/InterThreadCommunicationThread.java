package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.threadcommunication;

public class InterThreadCommunicationThread implements Runnable {

    private SimplyPrintingNumbers simplyPrintingNumbers;

    public void setSimplyPrintingNumbers(SimplyPrintingNumbers simplyPrintingNumbers) {
        this.simplyPrintingNumbers = simplyPrintingNumbers;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        synchronized (simplyPrintingNumbers){
            simplyPrintingNumbers.printOddNumbers();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            simplyPrintingNumbers.printEvenNumbers();
        }


    }


}
