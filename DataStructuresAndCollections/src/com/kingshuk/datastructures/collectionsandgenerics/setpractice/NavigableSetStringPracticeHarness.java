package com.kingshuk.datastructures.collectionsandgenerics.setpractice;

import java.util.NavigableSet;
import java.util.TreeSet;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/** Class created for practicing navigable set methods
 * Created by CO21321 on 2/5/2018.
 */
public class NavigableSetStringPracticeHarness {

    public static void main(String[] args) {
        NavigableSet<String> someStrings= new TreeSet<>(CommonCollectionGenerator.getPriorityQueue());

        System.out.println("Printing the entire set "+someStrings);

        System.out.println("The greatest name (string value) less than or equal to \"Darren \" in the set is "+ someStrings.floor("Darren"));

        System.out.println("The greatest name (string value) less than or equal to \"Domino \" in the set is "+ someStrings.floor("Domino"));

        System.out.println("The greatest name (string value) less than \"Darren \" in the set is "+ someStrings.lower("Darren"));

        System.out.println("The smallest name (string value) greater than \"Nandan \" in the set is "+ someStrings.higher("Nandan"));

        System.out.println("The smallest name (string value) greater than or equal to \"Nandan \" in the set is "+ someStrings.ceiling("Nandan"));

        System.out.println("The smallest name (string value) greater than or equal to \"Ranajoy \" in the set is "+ someStrings.ceiling("Ranajoy"));

        System.out.println("Printing the entire set in descending order "+ someStrings.descendingSet());

        //Now checking what happens when the string name value we pass in is indeed at either end of the set
        //All of them return null but doesn't throw any exception or anything
        System.out.println("_______________________________________________________________________________");

        System.out.println("The greatest name (string value) less than \"Anand \" in the set is "+ someStrings.lower("Anand"));

        System.out.println("The smallest name (string value) greater than \"Steve \" in the set is "+ someStrings.higher("Steve"));

        System.out.println("The greatest name (string value) less than or equal to \"Abhishek \" in the set is "+ someStrings.floor("Abhishek"));

        System.out.println("The smallest name (string value) greater than or equal to \"Syrus \" in the set is "+ someStrings.ceiling("Syrus"));

        //The poll methods, they remove and return the first and last number in the set with PollFirst and PollLast respectively
        System.out.println("_______________________________________________________________________________");

        System.out.println("Polling the first element of the set "+someStrings.pollFirst());

        System.out.println("Polling the last element of the set "+someStrings.pollLast());

        System.out.println("Printing the entire set again after using pollFirst() and pollLast() "+someStrings);
    }
}
