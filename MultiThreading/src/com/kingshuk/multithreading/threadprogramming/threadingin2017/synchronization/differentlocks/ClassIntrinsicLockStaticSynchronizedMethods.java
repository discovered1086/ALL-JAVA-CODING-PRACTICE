package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.differentlocks;

public class ClassIntrinsicLockStaticSynchronizedMethods implements Runnable {
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
        printEvenNumbers();
        printOddNumbers();
    }

    private static synchronized void printOddNumbers() {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " is printing " + i);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }

    }

    private static synchronized void printEvenNumbers() {
            for (int i = 0; i <= 10; i++) {
                if (i % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " is printing " + i);
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
