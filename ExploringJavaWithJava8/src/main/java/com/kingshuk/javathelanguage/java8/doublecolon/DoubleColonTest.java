package com.kingshuk.javathelanguage.java8.doublecolon;

public class DoubleColonTest {
    public static void main(String[] args) {

        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("This is the thread using lambda expression");
                try {
                    Thread.sleep(900);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t2=new Thread(runnable2);
        t2.start();

        MyRunnableClass runnableClass=new MyRunnableClass();
        Runnable runnable=runnableClass::doTheThreadsJob;

        Thread t1=new Thread(runnable);
        t1.start();
    }
}
