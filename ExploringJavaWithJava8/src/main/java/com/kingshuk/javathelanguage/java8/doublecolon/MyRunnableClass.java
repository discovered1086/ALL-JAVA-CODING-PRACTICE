package com.kingshuk.javathelanguage.java8.doublecolon;

public class MyRunnableClass {
    protected void doTheThreadsJob() {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is the child thread using the double colon mapping");
            try {
                Thread.sleep(1300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
