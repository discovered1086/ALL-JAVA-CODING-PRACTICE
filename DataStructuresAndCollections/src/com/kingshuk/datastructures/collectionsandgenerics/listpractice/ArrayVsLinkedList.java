package com.kingshuk.datastructures.collectionsandgenerics.listpractice;

import java.util.*;

/**
 * Created by CO21321 on 1/30/2018.
 */
public class ArrayVsLinkedList {

    public static void main(String[] args) {
        List<Integer> numbersList=new LinkedList<>();

        List<Integer> numbersList2=new ArrayList<>();

        //Insertion of 1 million numbers in the linked list vs array list
        long startTimeArrayList=System.currentTimeMillis();
        for (int i = 1; i <1000000 ; i++) {
            numbersList.add(i);
        }
        long endTimeArrayList=System.currentTimeMillis();

        System.out.println("Time taken by ArrayList to add a million integers is "+(endTimeArrayList-startTimeArrayList));


        //Insertion of 10 million numbers in the linked list vs array list
        long startTimeLinkedList=System.currentTimeMillis();
        for (int i = 1; i <1000000 ; i++) {
            numbersList2.add(i);
        }
        long endTimeLinkedList=System.currentTimeMillis();

        System.out.println("Time taken by LinkedList to add a million integers is "+(endTimeLinkedList-startTimeLinkedList));

        Integer [] arrayOfIntegers=new Integer[10000000];

        for (int i = 1; i <10000000 ; i++) {
            arrayOfIntegers[i]=i;
        }


        //Inserting an array of integers in the ArrayList
        startTimeArrayList=System.currentTimeMillis();
        numbersList.addAll(5000, Arrays.asList(arrayOfIntegers));
        endTimeArrayList=System.currentTimeMillis();


        System.out.println("Time taken by ArrayList to add another collection is "+(endTimeArrayList-startTimeArrayList));


        //Inserting an array of integers in the ArrayList
        startTimeLinkedList=System.currentTimeMillis();
        numbersList2.addAll(5000, Arrays.asList(arrayOfIntegers));
        endTimeLinkedList=System.currentTimeMillis();


        System.out.println("Time taken by LinkedList to add another collection is "+(endTimeLinkedList-startTimeLinkedList));

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------");


        //Reading test for array list
        startTimeArrayList=System.currentTimeMillis();
        /*for (Integer number: numbersList){
            //System.out.println("The number printing now is "+number);
            /*if(number<=25){
                System.out.println("The Array List number printing now is "+number);
            }
        }*/
        System.out.println("The one millionth number in the array list is "+numbersList.get(1000000));
        endTimeArrayList=System.currentTimeMillis();

        System.out.println("Time taken by ArrayList to read the whole list "+(endTimeArrayList-startTimeArrayList));


        //Reading test for linked list
        startTimeLinkedList=System.currentTimeMillis();
        /*for (Integer number: numbersList2){
            //System.out.println("The number printing now is "+number);
            /*if(number<=25){
                System.out.println("The number printing now is "+number);
            }
        }*/
        System.out.println("The one millionth number in the linked list is "+numbersList2.get(1000000));
        endTimeLinkedList=System.currentTimeMillis();

        System.out.println("Time taken by LinkedList to read the whole list "+(endTimeLinkedList-startTimeLinkedList));

        //Random access is slower in linked list
    }
}
