package com.kingshuk.corejava.basic.inheritance.methodoverriding;

public class Condo extends RentedAbode{

    @Override
    public double getRent() {
        return 2000.00;
    }

    @Override
    public int getArea() {
        return 1200;
    }
}
