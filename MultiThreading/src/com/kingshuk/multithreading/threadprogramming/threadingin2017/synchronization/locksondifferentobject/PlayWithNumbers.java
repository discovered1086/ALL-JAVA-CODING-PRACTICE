package com.kingshuk.multithreading.threadprogramming.threadingin2017.synchronization.locksondifferentobject;

/**
 * This is a class that has one instance variable and two synchronization methods.
 * This class was created to test the object level synchronization which says when
 * One thread (that has access to this object has called the incrementOdd method for example
 * The other threads that also have access to this object can't even call incrementEven method
 * on this object
 */
public class PlayWithNumbers {
    private Integer counter=0;

    public synchronized void incrementOdd(){
        System.out.println(Thread.currentThread().getName()+" has entered the incrementOdd method");
        counter++;
        /*try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        System.out.println(Thread.currentThread().getName()+" is exiting the incrementOdd method");
    }

    public synchronized void incrementEven(){
        System.out.println(Thread.currentThread().getName()+" has entered the incrementEven method");
        counter+=2;
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
