package com.kingshuk.corejava.basic.inheritance;

public class Animal {

    public Animal() {
        System.out.println("Inside the constructor of the Animal class");
        System.out.println("The Animal class's address is "+this);
    }

    void eats(){
        System.out.println("The animal eats food");
    }
}
