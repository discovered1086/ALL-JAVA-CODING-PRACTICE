package com.kingshuk.multithreading.threadprogramming.assignmentcscarlton;

public class SharedCounterStaticSynchronized extends Thread {

    private static Integer counter = 0;

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
        doTheJob();
    }


    private static synchronized void doTheJob(){
        System.out.println("The thread " + Thread.currentThread().getName() + " is entering the synchronized block");
        for (int i = 1; i <= 10; i++) {
            counter++;
            System.out.println("The current value of the counter updated by "
                    + Thread.currentThread().getName() + ", is " + counter);
        }
        System.out.println("The thread " + Thread.currentThread().getName() + " is exiting the synchronized block");
    }
}
