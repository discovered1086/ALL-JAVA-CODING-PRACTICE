package com.kingshuk.javathelanguage.java8.predicate;

import java.util.function.Predicate;

public class PredicateJoinHarness {
    public static void main(String[] args) {
        Integer[] targetArray = {2, 3, 9878, 57, 89, 7741, 587, 56};

        Predicate<Integer> checkDivisibleByTwo = theNumber -> theNumber % 2 == 0;

        Predicate<Integer> checkDivisibleByFour = (theNumber) -> (theNumber % 4 == 0);

        printDivisible(checkDivisibleByTwo.negate(), targetArray);

        System.out.println("---------------------------------------------\n");

        printDivisible(checkDivisibleByTwo.and(checkDivisibleByFour.negate()),targetArray);
    }

    private static void printDivisible(Predicate<Integer> predicate1,
                                    Integer[] theArray) {
        for (Integer theNumber : theArray) {
            if (predicate1.test(theNumber)) {
                System.out.println(theNumber + " is divisible by two but not divisible by four");
            }
        }
    }
}
