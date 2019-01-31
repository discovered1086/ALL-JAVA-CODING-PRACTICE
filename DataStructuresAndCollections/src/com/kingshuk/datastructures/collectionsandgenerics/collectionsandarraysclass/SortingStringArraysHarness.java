package com.kingshuk.datastructures.collectionsandgenerics.collectionsandarraysclass;

import java.util.Arrays;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonArrayGenerator;

/**
 * A class to practice the sorting on Arrays
 * Created by CO21321 on 2/7/2018.
 */
public class SortingStringArraysHarness {

    public static void main(String[] args) {
        String [] arrayOfNames= CommonArrayGenerator.getArrayOfNames();

        System.out.println("The array elements BEFORE sorting");
        for (String names : arrayOfNames) {
            System.out.println(names);
        }

        System.out.println("__________________________________________________________________\n" +
                "The array elements AFTER sorting");

        Arrays.sort(arrayOfNames);

        for (String names : arrayOfNames) {
            System.out.println(names);
        }
    }
}

