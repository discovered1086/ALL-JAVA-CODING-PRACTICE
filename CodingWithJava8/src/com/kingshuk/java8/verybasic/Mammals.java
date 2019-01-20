package com.kingshuk.java8.verybasic;

/**
 * This is another interface that extends the functional interface
 *
 * Here're few rules around this
 *
 * 1. Mammals won't remain a functional interface if it declares any new method, however it can still override
 * the method in Animal interface.
 *
 * 2. If Mammals does so, it'll become a normal interface.
 */
@FunctionalInterface
public interface Mammals extends Animal{

    //avoid makeNoise(); if I do this, Mammals does NOT remain a functional interface

    void eats(); //I can do this and it would still remain a functional interface
}
