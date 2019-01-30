package com.kingshuk.multithreading.threadprogramming.assignmentcscarlton;

public class ReverseHello {

    public static void main(String[] args) {
        Thread thread=new Thread(new HelloPrinterThread(1));
        thread.setName("Thread - " + 1);
        thread.start();
    }
}
