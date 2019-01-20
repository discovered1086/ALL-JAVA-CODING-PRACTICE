package com.kingshuk.java8.predicate;

import java.util.function.Predicate;

public class PredicateTestHarness {
    public static void main(String[] args) {
        /**
         * So in the below line we're actually defining the method's
         * implementation. We're basically saying there's a parameter called 'name'
         * which when passed in the method, the method should tell me if the name
         * provided has the word 'King' in it or not.
         */
        Predicate<String> checkName = name-> name.contains("King");

        System.out.println("Does the name Deeksha contain the word?"+checkName.test("Deeksha"));
    }
}
