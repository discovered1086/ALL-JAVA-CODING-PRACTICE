package com.kingshuk.corejava.basic.inheritance.methodoverriding;

public class OwnedAbode extends Abode{

    protected double loanEmi;

    public double getLoanEmi() {
        return loanEmi;
    }

    public void setLoanEmi(double loanEmi) {
        this.loanEmi = loanEmi;
    }
}
