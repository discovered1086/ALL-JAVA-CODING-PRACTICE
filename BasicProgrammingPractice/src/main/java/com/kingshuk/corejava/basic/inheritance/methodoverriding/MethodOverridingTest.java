package com.kingshuk.corejava.basic.inheritance.methodoverriding;

public class MethodOverridingTest {

    public static void main(String[] args) {
        Apartment apartment=new Apartment();

        Condo condo=new Condo();

        System.out.println("The rent of an apartment is "+apartment.getRent());

        System.out.println("The rent of a condo is "+condo.getRent());
    }
}
