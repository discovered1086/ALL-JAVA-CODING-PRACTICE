package com.kingshuk.datastructures.collectionsandgenerics.collectionsandarraysclass;

import java.util.Collections;
import java.util.List;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/**
 * This class is for practicing binary search through Collections class
 * Created by CO21321 on 2/7/2018.
 */
public class BinarySearchStringCollectionsHarness {
    public static void main(String[] args) {
        /**
         *  1. Methods in the Collections class only work on a List
         *  2. Binary Search only works on a sorted list. It won't work until the list is sorted. It won't
         *  throw any exception but the search simply doesn't work
         *
         *  3. Binary search method on Collections class only returns the index of the element we're looking for.
         *  4. If binary search doesn't find the element then it returns a negative integer, suggesting where the element
         *  would be if it were present in the list.
         *
         *  ex. in a list of strings that has [A, B, D,E] if you're looking for C it would return -3 meaning if C was present,
         *  it would be present in the 3rd position (index 2: nth position means index (n-1))
         *
         *  5. Collections.sort() works when the list of objects being passed implement the comparable interface,
         *  otherwise we need to pass a comparator to the method call (overloaded sort method)
         */

        List<String> listOfNames = CommonCollectionGenerator.getListOfNames();

        System.out.println("The list of names before sorting \n " + listOfNames);

        Collections.sort(listOfNames);

        System.out.println("___________________________________________________________________\n" +
                "The list of names after sorting \n " + listOfNames);

        System.out.println("\nThe index of the name \"Kingshuk\" is: " + Collections.binarySearch(listOfNames, "Kingshuk"));

        System.out.println("\nThe index of the name \"Kaushik\" is: " + Collections.binarySearch(listOfNames, "Kaushik"));

    }
}
