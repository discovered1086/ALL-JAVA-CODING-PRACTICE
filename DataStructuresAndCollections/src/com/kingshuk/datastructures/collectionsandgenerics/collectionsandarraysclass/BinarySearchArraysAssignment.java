package com.kingshuk.datastructures.collectionsandgenerics.collectionsandarraysclass;

import java.util.Arrays;

/** Bharath's assignment on binary search using Arrays class
 * Created by CO21321 on 2/7/2018.
 */
public class BinarySearchArraysAssignment {

    public static void main(String[] args) {
        /**
         * 1. Just like Collections class, Arrays class also has the methods sort (with and without comparator)
         * and binarySearch.
         * 2. Seems like the only difference between the binarySearch method in Collections class and the Arrays
         * class is that, unlike the method in the Collections class the method in the Arrays class doesn't need the
         * data structure (array, list) to be already sorted.
         *
         * 3. Here the search for ane element that does NOT exist in the Array returns same result as was the case
         * for binary search for Collections. The only difference is that if we binary search for an element, that does not
         * exist in the array, that has not been sorted, it's still able to return the position where the element should have been,
         * it was present in the array, and that determination seems to be based on the natural ordering of the elements.
         */
        String [] strings= {"V", "A", "Z", "P"};

        System.out.println("The array elements BEFORE sorting");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("\nThe index of the element (searching BEFORE sorting) \"Z\" is: " + Arrays.binarySearch(strings, "Z"));

        System.out.println("The index of the element (searching BEFORE sorting) \"F\" is: "+Arrays.binarySearch(strings,"F"));

        Arrays.sort(strings);

        System.out.println("__________________________________________________________________\n" +
                "The array elements AFTER sorting");

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println("The index of the element (searching AFTER sorting) \"Z\" is: " + Arrays.binarySearch(strings, "Z"));

        System.out.println("The index of the element (searching AFTER sorting) \"F\" is: "+Arrays.binarySearch(strings,"F"));
    }
}
