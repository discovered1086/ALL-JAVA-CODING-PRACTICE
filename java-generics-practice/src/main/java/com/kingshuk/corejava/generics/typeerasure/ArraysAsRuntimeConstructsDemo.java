package com.kingshuk.corejava.generics.typeerasure;

import java.util.Arrays;

public class ArraysAsRuntimeConstructsDemo {

    public static void main(String[] args) {
        String[] namesArray = new String[5];
        addToArray(namesArray, "Kingshuk", 0);
        addToArray(namesArray, "Deeksha", 1);
        incorrectAddToArray(namesArray, 100, 0);
        incorrectAddToArray(namesArray, 101, 1);

        String name = namesArray[0];

        System.out.println(Arrays.toString(namesArray));
    }

    private static void addToArray(String[] namesArray, String name, int index) {
        namesArray[index] = name;
    }

    private static void incorrectAddToArray(Object[] namesArray, Integer i, int index) {
        namesArray[index] = i;
    }

}
