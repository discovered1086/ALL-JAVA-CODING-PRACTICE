package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.differentlocks;

public class ClassIntrinsicLockHarness {

    public static void main(String[] args) {
        //Thread t1=new Thread(new ClassIntrinsicLock());
        //Thread t2=new Thread(new ClassIntrinsicLock());
        //Thread t1=new Thread(new ClassIntrinsicLockSynchronizedMethods());
        //Thread t2=new Thread(new ClassIntrinsicLockSynchronizedMethods());
        //Thread t1=new Thread(new ClassIntrinsicLockStaticSynchronizedMethods());
        //Thread t2=new Thread(new ClassIntrinsicLockStaticSynchronizedMethods());
        Thread t1=new Thread(new ClassIntrinsicLockOneStaticSynchronizedMethods());
        Thread t2=new Thread(new ClassIntrinsicLockOneStaticSynchronizedMethods());

        t1.start();
        t2.start();
    }
}
