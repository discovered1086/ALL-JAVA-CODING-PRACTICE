package com.kingshuk.corejava.basic.inheritance.methodoverriding;

public class Apartment extends RentedAbode{

    public double getRent() {
        return 1000.75;
    }

    @Override
    public int getArea() {
        return 750;
    }
}
