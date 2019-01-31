package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice;

import java.util.Collections;
import java.util.List;

import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.SortStringLengthComparator;
import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/** A harness class to test the string sorting by length
 * Created by CO21321 on 2/2/2018.
 */
public class SortStringsByLengthHarness {
    public static void main(String[] args) {
        List<String> namesList = CommonCollectionGenerator.getListOfNames();

        System.out.println("Before sorting \n ____________________________________________ \n");
        for (String name : namesList) {
            System.out.println(name);
        }

        Collections.sort(namesList, new SortStringLengthComparator());

        /**
         * One very important thing to remember here is that using a comparator is very efficient
         * method of sorting but there's a little something that we should be aware of.
         *
         * If the comparator returns 0 for two objects meaning the comparator can't decide between
         * two objects, then the objects natural ordering prevails. The natural ordering comes from
         * the comparable implementation of the object. That's why in this example even though
         * there are some names that have exact same length, there's no problem as the default/natural ordering
         * of strings prevail and they're sorted based on alphabetical order.
         *
         * It's interesting through when comparator compares objects that don't have any default implementation
         * of Comparable or in other words, there's no natural ordering.
         */
        System.out.println("After sorting \n ____________________________________________ \n");
        for (String name : namesList) {
            System.out.println(name);
        }
    }
}
