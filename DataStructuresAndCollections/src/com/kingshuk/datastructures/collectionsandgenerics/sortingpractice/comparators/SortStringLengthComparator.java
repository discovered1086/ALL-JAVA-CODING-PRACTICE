package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import java.util.Comparator;

/**A class that acts as a comparator to sort strings by length
 * Created by CO21321 on 2/2/2018.
 */
public class SortStringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        return new Integer(s1.length()).compareTo(s2.length());
    }
}
