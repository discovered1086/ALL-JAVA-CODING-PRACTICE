package mypractice.collectionsandgenerics.collectionsandarraysclass;

import mypractice.collectionsandgenerics.utility.CommonArrayGenerator;

import java.util.Arrays;
import java.util.List;

/**
 * A new class to practice the as list method in detail
 * Created by CO21321 on 2/7/2018.
 */
public class AsListOnArraysWithStringsHarness {

    public static void main(String[] args) {
        /**
         * Things to remember here
         *
         * 1. Through the method, we get a list out of the array
         * 2. The array is modifiable even after the list has been generated out of it
         * AND....AND the list will automatically be updated if and when that happens. (draw a diagram describing why it happens).
         */
        String[] arrayOfNames = CommonArrayGenerator.getArrayOfNames();

        System.out.println("Printing the elements of the array\n");
        for (String names : arrayOfNames) {
            System.out.println(names);
        }

        List<String> nameList = Arrays.asList(arrayOfNames);

        System.out.println("\n___________________________________________________________\n" +
                "Printing the list \n" + nameList);

        arrayOfNames[3]="Chodna Beta";

        System.out.println("\n___________________________________________________________\n" +
                "Changed some values in the array and now the array is \n");
        for (String names : arrayOfNames) {
            System.out.println(names);
        }

        System.out.println("\n___________________________________________________________\n" +
                "Printing the list after the change was made to the array \n" + nameList);


        /**
         * Now let's modify an element in the list and see what happens
         *
         * NO PROBLEM...!! The array also got updated
         */
        nameList.set(3, "Amit");

        System.out.println("\n___________________________________________________________\n" +
                "Printing the list after an element in the list was changed \n" + nameList);

        System.out.println("\n___________________________________________________________\n" +
                "Printing the array after an element in the list was changed \n");
        for (String names : arrayOfNames) {
            System.out.println(names);
        }

        /**
         * Let's add a new element in the list/ remove an element from the list and see what happens
         *
         * BAM..!! Exceptions. continuing from the top,
         * Things to remember here
         *
         * ## The above operation where one element of the list was modified and the change reflected in the array
         * but here we tried to add or remove an element to/from the list and now we have a problem.
         * This leads me to my final observation on this method
         *
         * 3. The list created out of the array can be modified as long as the size of the list does NOT change. It's really
         * easy to understand why. Arrays are not dynamic data structures. It's size is declared when it's created and the size
         * can't be manipulated on the fly like Collections or Maps.
         */
        nameList.add("Prasun");
        nameList.remove(2);

        System.out.println("\n___________________________________________________________\n" +
                "Printing the array after an element was added in the list \n");
        for (String names : arrayOfNames) {
            System.out.println(names);
        }

        System.out.println("\n___________________________________________________________\n" +
                "Printing the list after an element was added in the list \n" + nameList);
    }
}
