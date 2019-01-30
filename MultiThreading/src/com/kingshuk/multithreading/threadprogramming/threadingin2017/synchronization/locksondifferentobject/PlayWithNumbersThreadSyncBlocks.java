package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.locksondifferentobject;

public class PlayWithNumbersThreadSyncBlocks implements Runnable {
    private PlayWithNumbersSyncBlocks play;

    public PlayWithNumbersThreadSyncBlocks(PlayWithNumbersSyncBlocks play) {
        this.play = play;
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
        for (int i = 1; i <= 10; i++) {
            play.incrementEven();
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            play.incrementOdd();
            System.out.println("The current value of the counter as printed by " +
                    Thread.currentThread().getName() + " is " + play.getCounter());
        }
    }
}
