package com.kingshuk.corejava.basic.inheritance;

public class Cat extends Mammal {

    public Cat() {
        System.out.println("Inside the constructor of the Cat class");
        System.out.println("The Cat class's address is "+this);
    }

    @Override
    void eats() {
        System.out.println("The Cat drinks milk and eats cat food");
    }
}
