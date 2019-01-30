package com.kingshuk.multithreading.threadprogramming.threadingin2017;

/**
 * Created by kingshuk on 8/4/17.
 */
public class ThreadTestMain {

    public static void main(String [] args){
        ThreadTestMain class1=new ThreadTestMain();
        ThreadTestMain class2=new ThreadTestMain();
        class1.justPrint();
        class2.justPrint();
    }

    private void justPrint(){
        for(int i=0;i<=10;i++){
            System.out.println("Printing "+i);
        }
    }

}
