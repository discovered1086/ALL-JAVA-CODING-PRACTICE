package com.kingshuk.javathelanguage.java8.predicate;

import java.util.function.Predicate;

public class PredicateMethodArgHarness {
    public static void main(String[] args) {
        Integer [] divisibleByTwo = {2,3,9878,57,89,7741,587,56};

        /*The below part is the definition part of the functional interface called
         * predicate.
         */
        Predicate<Integer> checkDivisibleByTwo=(theNumber)->(theNumber%2==0);

        /*Here we're passing the predicate or the rule and the target of that rule to the method
         *printDivisibleByTwo. This is where we experience the power of lambda expressions
         * and functional programming. We're able to pass behavior or a method as part of argument 
         * to another method.
         * 
         */
        printDivisibleByTwo(checkDivisibleByTwo,divisibleByTwo);
    }

    static void printDivisibleByTwo(Predicate<Integer> predicate,Integer[] theArray){
        for(Integer theNumber:theArray){
            if(predicate.test(theNumber)){
                System.out.println(theNumber+" is divisible by two");
            }
        }
    }
}
