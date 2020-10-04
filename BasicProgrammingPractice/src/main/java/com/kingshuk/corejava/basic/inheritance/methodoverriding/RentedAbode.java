package com.kingshuk.corejava.basic.inheritance.methodoverriding;

public class RentedAbode extends Abode {

    protected double rent;

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }
}
