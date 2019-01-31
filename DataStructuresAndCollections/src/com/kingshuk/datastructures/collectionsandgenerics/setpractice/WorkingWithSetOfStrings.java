package com.kingshuk.datastructures.collectionsandgenerics.setpractice;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/**This class is for practicing set with Strings
 * Created by CO21321 on 1/30/2018.
 */
public class WorkingWithSetOfStrings {

    public static void main(String[] args) {
        Set<String> nameSet=new HashSet<>(CommonCollectionGenerator.getListOfNames());


        System.out.println("Print names from a Hash Set \n ");
        for (String name : nameSet) {
            System.out.println(name);
        }

        //OP: Some random order is generated

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        //Again checking if Linked Hash Set does indeed hold values in the order they are inserted
        nameSet=new LinkedHashSet<>(CommonCollectionGenerator.getListOfNames());

        System.out.println("Print names from a LinkedHashSet \n ");
        for (String name : nameSet) {
            System.out.println(name);
        }

        //OP: Ordered based on how it was entered

        System.out.println("--------------------------------------------------------------------------------------------------------------");

        //Now checking a tree set
        nameSet=new TreeSet<>(CommonCollectionGenerator.getListOfNames());

        System.out.println("Print names from a Tree Set \n ");
        for (String name : nameSet) {
            System.out.println(name);
        }

        //OP: It's sorted in the alphabetical order.
    }
}
