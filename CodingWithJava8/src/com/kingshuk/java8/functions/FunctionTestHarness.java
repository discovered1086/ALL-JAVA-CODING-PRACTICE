package com.kingshuk.java8.functions;

import java.util.function.Function;

public class FunctionTestHarness {
    public static void main(String[] args) {
        /**
         * We're defining the method behavior below.
         *
         * We can define multiple such behaviors and pass them in Java methods just like
         * the predicates
         */

        Function<String, Boolean> checkExistenceOfWord=name->name.contains("K");

        System.out.println(checkExistenceOfWord.apply("Kingshuk"));
    }
}
