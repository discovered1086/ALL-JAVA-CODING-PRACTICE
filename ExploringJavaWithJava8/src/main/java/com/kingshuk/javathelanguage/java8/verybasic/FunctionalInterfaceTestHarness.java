package com.kingshuk.javathelanguage.java8.verybasic;

public class FunctionalInterfaceTestHarness {
    public static void main(String[] args) {
        //Animal animal=new Cat();
        //animal.eats();

        /**
         * The two lines above can be replaced by the below lambda expression
         *
         * by calling ()-> we're actually providing an implementation right there.
         * We don't need any class to implement it at that point. We can implement
         * the method right there and then
         *
         * invoke it by saying animal.eats();
         *
         * the ()-> is empty because there're no arguments.
         *
         * It's just like method calls in ECMA script 6 in java script
         * where you get to call a method like ()=> {<implementation>}
         *
         * Have to know though, what happens behind the scenes
         */
        Animal animal=()-> System.out.println("The cat eats cat food");
        animal.eats();
    }
}
