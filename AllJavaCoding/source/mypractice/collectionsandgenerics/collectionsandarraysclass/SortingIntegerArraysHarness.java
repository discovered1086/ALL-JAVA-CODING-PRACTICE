package mypractice.collectionsandgenerics.collectionsandarraysclass;

import mypractice.collectionsandgenerics.utility.CommonArrayGenerator;

import java.util.Arrays;

/**
 * A class to practice the sorting on Arrays
 * Created by CO21321 on 2/7/2018.
 */
public class SortingIntegerArraysHarness {
    public static void main(String[] args) {
        Integer[] arrayOfIntegers = CommonArrayGenerator.getArrayOfRandomNumbers();

        System.out.println("The array elements BEFORE sorting");
        for (Integer arrayOfInteger : arrayOfIntegers) {
            System.out.println(arrayOfInteger);
        }

        System.out.println("__________________________________________________________________\n"+
                "The array elements AFTER sorting");

        Arrays.sort(arrayOfIntegers);

        for (Integer arrayOfInteger : arrayOfIntegers) {
            System.out.println(arrayOfInteger);
        }
    }
}

