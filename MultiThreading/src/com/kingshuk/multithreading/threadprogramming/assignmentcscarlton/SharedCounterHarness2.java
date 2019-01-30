package com.kingshuk.multithreading.threadprogramming.assignmentcscarlton;

public class SharedCounterHarness2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            Thread thread = new SharedCounterStaticSynchronized();
            thread.setName("Thread - " + i);
            thread.start();
        }
    }
}
