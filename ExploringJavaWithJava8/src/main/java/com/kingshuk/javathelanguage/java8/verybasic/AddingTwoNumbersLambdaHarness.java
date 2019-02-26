package com.kingshuk.javathelanguage.java8.verybasic;

public class AddingTwoNumbersLambdaHarness {
    public static void main(String[] args) {
        /**
         * So here, the arguments are declared inside the brackets
         * and brackets are not required because it's a single line of statement
         *
         * Fot multiple statements you need curly braces
         */

    	/*
    	 * The below is an example of valid lambda expression if we insist on using 
    	 * the return keyword.
    	 * Addition addition = (a,b) -> {return a + b;};
    	 */
    	
    	Addition addition = (a,b) -> a+b;

        Addition addition1 = (a,b) -> {
            Integer c = a + b;
            return c;
        };

        System.out.println("The addition of two numbers is: " + addition1.add(7367238, 32862837));
        
        System.out.println("The addition of two numbers is: " + addition.add(7367238, 32862837));
    }
}
