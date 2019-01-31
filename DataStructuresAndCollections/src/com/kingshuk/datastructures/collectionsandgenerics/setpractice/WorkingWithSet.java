package com.kingshuk.datastructures.collectionsandgenerics.setpractice;

import java.util.*;

/** This class is for practicing set collection
 * Created by CO21321 on 1/30/2018.
 */
public class WorkingWithSet {

    public static void main(String[] args) {
        List<Integer> listOfIntegers=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i <25 ; i++) {
            listOfIntegers.add(random.nextInt(10));
        }

        System.out.println("The elements in the list are: "+listOfIntegers);

        Set<Integer> setOfIntegers=new HashSet<>(listOfIntegers);

        System.out.println("The elements in the set are: "+setOfIntegers);

        //Notice the order of the hash set. It's not the order in which it was inserted.
        //Some kind of sorting has been done on it.
        //If we don't want any sorting to be done, LinkedHashSet would do the work

        //Linked Hash Set preserves the original order of insertion
        //Which means for larger set of elements if you don't need sorting
        //Then this will save some performance lapse
        Set<Integer> unsortedSet=new LinkedHashSet<>(listOfIntegers);

        System.out.println("The elements in the Linked Hash set are: "+unsortedSet);

        //Tree sets are always sorted. They inherit from Sorted Set interface
        Set<Integer> treeSet=new TreeSet<>(listOfIntegers);

        System.out.println("The elements in the Tree set are: "+treeSet);

    }
}
