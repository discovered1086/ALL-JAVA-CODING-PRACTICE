package com.kingshuk.multithreading.threadprogramming.threadingin2017.executor.callableandfuture;

import java.util.concurrent.Callable;

/**
 * Created by kingshuk on 8/4/17.
 */
public class JustPrinting implements Callable<Boolean> {

    @Override
    public Boolean call() throws Exception {
        for(int i=0;i<=12;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                return false;
            }
            System.out.println(Thread.currentThread().getName()+" is printing "+i);
        }
        return true;
    }
}
