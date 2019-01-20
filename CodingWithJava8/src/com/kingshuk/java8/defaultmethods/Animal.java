package com.kingshuk.java8.defaultmethods;

/** This is my first attempt to write a functional interface in java 8
 * Created by CO21321 on 2/19/2018.
 */

/**
 * If an interface has one and only one abstract method, it's called a functional interface
 * and the method is called a functional method.
 *
 * Functional interfaces allow us to use lambda expressions
 *
 * It can have any number of default methods
 *
 * The declaration of @FunctionalInterface prevents declaration of multiple abstract methods
 *
 * ex of inbuilt ones
 * Runnable --> run()
 * Comparator --> compareTo()
 */

public interface Animal {

    default void eats(){
        System.out.println("All animals eat food");
    }
}
