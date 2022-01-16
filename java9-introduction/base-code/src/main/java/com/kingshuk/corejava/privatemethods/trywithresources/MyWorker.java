package com.kingshuk.corejava.privatemethods.trywithresources;

public class MyWorker implements AutoCloseable{

    public void printMessage(){
        System.out.println("The message is printed by the worker");
    }

    @Override
    public void close() {
        System.out.println("Closing the my worker");
    }
}
