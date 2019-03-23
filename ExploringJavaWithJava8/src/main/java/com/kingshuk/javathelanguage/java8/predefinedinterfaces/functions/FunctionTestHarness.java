package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionTestHarness {
    public static void main(String[] args) {
        /**
         * We're defining the method behavior below.
         *
         * We can define multiple such behaviors and pass them in Java methods just like
         * the predicates
         */

        //Function<String, Integer> checkLengthOfWord=name->name.length();
    	
    	//System.out.println("The lenth of the word is: "+checkLengthOfWord.apply("Kingshuk"));
    	
    	/*
    	 * ToIntFunction is a special type of function which always returns an integer.
    	 */
    	//ToIntFunction<String> checkLengthOfWord=name->name.length();
    	
    	ToIntFunction<String> checkLengthOfWord=String::length;

        System.out.println("The lenth of the word is: "+checkLengthOfWord.applyAsInt("Kingshuk"));
    }
}
