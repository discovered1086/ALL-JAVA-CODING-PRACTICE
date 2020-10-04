package com.kingshuk.corejava.basic.abstraction.bharathsassignment;

public abstract class HP implements TouchScreenLaptop {

    @Override
    public void scroll() {
        System.out.println("Inside HP's scroll method");
    }
}
