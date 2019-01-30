package com.kingshuk.multithreading.threadprogramming.assignmentcscarlton;

public class HelloPrinterThread implements Runnable {

    private static Integer threadCounter = 2;
    private static Integer maxNumberOfThreads = 50;
    private Integer thisThreadNumber=0;

    public HelloPrinterThread(Integer thisThreadNumber) {
        this.thisThreadNumber = thisThreadNumber;
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

        if (threadCounter <= maxNumberOfThreads) {
            Thread thread = new Thread(new HelloPrinterThread(threadCounter));
            thread.setName("Thread - " + threadCounter);
            threadCounter++;
            thread.start();
        }

        try {
            Integer diff = (maxNumberOfThreads - (thisThreadNumber - 1)) * 1000;
            Thread.sleep(diff.longValue());
            System.out.println(Thread.currentThread().getName() + " is saying Hello...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
