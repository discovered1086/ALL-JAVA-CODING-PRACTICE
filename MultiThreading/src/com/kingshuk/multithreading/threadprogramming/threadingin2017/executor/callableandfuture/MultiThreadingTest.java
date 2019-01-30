package com.kingshuk.multithreading.threadprogramming.threadingin2017.executor.callableandfuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by kingshuk on 8/4/17.
 */
public class MultiThreadingTest {

    public static void main(String[] args) throws InterruptedException {
        JustPrinting justPrinting=new JustPrinting();

        ExecutorService service= Executors.newFixedThreadPool(2);

        Future future=service.submit(justPrinting);

        if(future.isDone()){
            try {
                System.out.println("Did all the numbers print successfully? "+future.get());
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        //Using the future interface, we can check if the thread's work has been done and then get the value using future.get() method.
        //Future interface provides a way to retrieve the values returned by the callable interface and then use them for something.

        service.shutdown();
    }
}
