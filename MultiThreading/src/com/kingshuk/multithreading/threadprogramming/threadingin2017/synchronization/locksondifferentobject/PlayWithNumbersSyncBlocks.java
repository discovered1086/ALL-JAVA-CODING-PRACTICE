package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.locksondifferentobject;

public class PlayWithNumbersSyncBlocks {
    private Integer counter=0;

    public void incrementOdd(){
        System.out.println(Thread.currentThread().getName()+" has entered the incrementOdd method");
        synchronized (this){
            counter++;
        }
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName()+" is exiting the incrementOdd method");
    }

    public void incrementEven(){
        System.out.println(Thread.currentThread().getName()+" has entered the incrementEven method");
        synchronized (this){
            counter+=2;
        }

        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName()+" is exiting the incrementEven method");
    }

    public Integer getCounter() {
        return counter;
    }
}
