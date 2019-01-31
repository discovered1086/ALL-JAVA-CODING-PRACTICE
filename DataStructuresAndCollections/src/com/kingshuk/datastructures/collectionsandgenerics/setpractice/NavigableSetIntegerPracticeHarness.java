package com.kingshuk.datastructures.collectionsandgenerics.setpractice;

import java.util.NavigableSet;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/** Class created for practicing navigable set methods
 * Created by CO21321 on 2/5/2018.
 */
public class NavigableSetIntegerPracticeHarness {
    public static void main(String[] args) {
        NavigableSet<Integer> someNumbers= CommonCollectionGenerator.getRandomNumbersForSetPractice();

        System.out.println("Printing the entire set "+someNumbers);

        System.out.println("The greatest number less than or equal to 400 in the set is "+ someNumbers.floor(400));

        System.out.println("The greatest number less than 400 in the set is "+ someNumbers.lower(400));

        System.out.println("The smallest number greater than 425 in the set is "+ someNumbers.higher(425));

        System.out.println("The smallest number greater than or equal to 425 in the set is "+ someNumbers.ceiling(425));

        System.out.println("Printing the entire set in descending order "+ someNumbers.descendingSet());

        //Now checking what happens when the number we pass in is indeed at either end of the set
        //All of them return null but doesn't throw any exception or anything
        System.out.println("_______________________________________________________________________________");

        System.out.println("The greatest number less than 225 in the set is "+ someNumbers.lower(225));

        System.out.println("The smallest number greater than 525 in the set is "+ someNumbers.higher(525));

        System.out.println("The greatest number less than or equal to 220 in the set is "+ someNumbers.floor(220));

        System.out.println("The smallest number greater than or equal to 550 in the set is "+ someNumbers.ceiling(550));

        //The poll methods, they remove and return the first and last number in the set with PollFirst and PollLast respectively
        System.out.println("_______________________________________________________________________________");

        System.out.println("Polling the first element of the set "+someNumbers.pollFirst());

        System.out.println("Polling the last element of the set "+someNumbers.pollLast());

        System.out.println("Printing the entire set again after using pollFirst() and pollLast() "+someNumbers);
    }
}
