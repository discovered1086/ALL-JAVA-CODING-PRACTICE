package com.kingshuk.javathelanguage.java8.defaultmethods;

public class DefaultMethodTestHarness {
    public static void main(String[] args) {
        Animal animal=new Tiger();
        animal.eats();
        
        Tiger tiger = new Tiger();
        tiger.eats();
        
        animal = new Cat();
        animal.eats();
    }
}
