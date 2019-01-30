package com.kingshuk.multithreading.threadprogramming.assignmentcscarlton;

public class SharedCounterHarness {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            Thread thread = new Thread(new SharedCounter());
            thread.setName("Thread - " + i);
            thread.start();
        }
    }
}
