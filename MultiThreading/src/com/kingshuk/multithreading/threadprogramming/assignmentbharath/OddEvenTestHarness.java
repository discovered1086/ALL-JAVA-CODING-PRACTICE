package com.kingshuk.multithreading.threadprogramming.assignmentbharath;

public class OddEvenTestHarness {

    public static void main(String[] args) {
        Runnable evenNumbersThread=new EvenNumberThread();
        Runnable oddNumbersThread=new OddNumberThread();

        Thread t1=new Thread(evenNumbersThread);
        Thread t2=new Thread(oddNumbersThread);

        t1.setName("Even Thread");
        t2.setName("Odd Thread");

        Thread.currentThread().setName("Main Thread");

        t1.start();
        t2.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName()+" is printing "+i);
        }
    }
}
