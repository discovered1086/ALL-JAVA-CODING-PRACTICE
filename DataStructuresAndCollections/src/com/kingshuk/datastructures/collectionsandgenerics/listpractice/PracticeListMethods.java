package com.kingshuk.datastructures.collectionsandgenerics.listpractice;

import java.util.ArrayList;
import java.util.List;

/** Practicing different methods and concepts of ArrayList
 * Created by CO21321 on 1/30/2018.
 */
public class PracticeListMethods {

    public static void main(String[] args) {
        List<Integer> numbersList=new ArrayList<>();

        for (int i = 25; i <250 ; i=i+25) {
            numbersList.add(i);
        }

        System.out.println("The first numbers list has the values "+numbersList);



        List<Integer> numbersList2=new ArrayList<>();

        for (int i = 50; i <250 ; i=i+50) {
            numbersList2.add(i);
        }

        System.out.println("The second numbers list has the values "+numbersList2);

        //Adding the second list at the end of the first list
        //numbersList.addAll(numbersList2);


        //Adding the second list at a particular position in the list
        numbersList.addAll(2,numbersList2);

        System.out.println("The first numbers list after adding the second list, has the values "+numbersList);


        //Setting a value at a particular location of the list
        numbersList.set(2,75);

        System.out.println("The first numbers list after setting a value at a particular location \n "+numbersList);

        //Getting the size of a list
        System.out.println("The size of the first list is "+numbersList.size());
        System.out.println("The size of the second list is "+numbersList2.size());

        //The remove method
        numbersList.remove(3);

        System.out.println("The first numbers list after removing a value at a particular location \n "+numbersList);

        //The remove method for removing a complete collection
        numbersList.removeAll(numbersList2);

        System.out.println("The first numbers list after removing a collection from this list \n "+numbersList);
    }
}
