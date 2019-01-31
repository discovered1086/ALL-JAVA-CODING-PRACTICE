package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import java.util.Comparator;

/** This class is a custom comparator for comparing the string buffers
 * Created by CO21321 on 1/31/2018.
 */
public class FixStringBufferComparator implements Comparator<StringBuffer> {

    @Override
    public int compare(StringBuffer t1, StringBuffer t2) {
       return t1.toString().compareTo(t2.toString());
    }
}
