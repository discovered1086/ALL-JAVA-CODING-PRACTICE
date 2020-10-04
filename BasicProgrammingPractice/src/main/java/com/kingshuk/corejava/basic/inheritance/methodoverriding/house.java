package com.kingshuk.corejava.basic.inheritance.methodoverriding;

public class house extends OwnedAbode {

    @Override
    public double getLoanEmi() {
        return 1100.78;
    }

    @Override
    public int getArea() {
        return 3000;
    }
}
