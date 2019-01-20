package mypractice.collectionsandgenerics.collectionsandarraysclass;

import mypractice.collectionsandgenerics.collectionelements.Cat;
import mypractice.collectionsandgenerics.collectionelements.Dog;
import mypractice.collectionsandgenerics.sortingpractice.comparators.AnimalCustomComparator;
import mypractice.collectionsandgenerics.sortingpractice.comparators.CatCustomComparator;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.Collections;
import java.util.List;

/**
 * This class is for practicing binary search through Collections class
 * Created by CO21321 on 2/7/2018.
 */
public class BinarySearchObjectCollectionsHarness {
    public static void main(String[] args) {
        /**
         *  1. Methods in the Collections class only work on a List
         *  2. Binary Search only works on a sorted list. It won't work until the list is sorted. It won't
         *  throw any exception but the search simply doesn't work
         *
         *  3. Binary search method on Collections class only returns the index of the element we're looking for.
         *  4. If binary search doesn't find the element then it returns a negative integer, suggesting where the element
         *  would be if it were present in the list.
         *
         *  ex. in a list of strings that has [A, B, D,E] if you're looking for C it would return -3 meaning if C was present,
         *  it would be present in the 3rd position (index 2: nth position means index (n-1))
         *
         *  5. Collections.sort() works when the list of objects being passed implement the comparable interface,
         *  otherwise we need to pass a comparator to the method call (overloaded sort method)
         */

        List<Dog> listOfDogObjects = CommonCollectionGenerator.getListOfDogObjects();

        System.out.println("The list of dogs before sorting \n " + listOfDogObjects);

        Collections.sort(listOfDogObjects);

        System.out.println("___________________________________________________________________\n" +
                "The list of dogs after sorting \n " + listOfDogObjects);

        System.out.println("\nThe index of the breed \"German\" is: " + Collections.binarySearch(listOfDogObjects, new Dog(true, "German")));

        System.out.println("\nThe index of the breed \"Spaniard\" is: " + Collections.binarySearch(listOfDogObjects, new Dog(true, "Spaniard")));

        System.out.println("\n___________________________________________________________________\n");

        List<Cat> catList=CommonCollectionGenerator.getListOfCatObjects();

        System.out.println("The list of cat before sorting \n " + catList);

        AnimalCustomComparator<Cat> catCustomComparator=new CatCustomComparator();

        Collections.sort(catList, catCustomComparator);

        System.out.println("___________________________________________________________________\n" +
                "The list of cats after sorting \n " + catList);

        /**
         * We need to pass the custom comparator object in the below search to let the binary search method know
         * how the objects are sorted, this is required because Cat doesn't implement comparable whereas Dog does
         * That's why for Dog we didn't need to pass the comparator
         */


        System.out.println("\nThe index of the cat named \"Cruger\" is: " + Collections.binarySearch(catList, new Cat("Cruger", "Quite"), catCustomComparator));

        System.out.println("\nThe index of the cat named \"Georgina\" is: " + Collections.binarySearch(catList, new Cat("Georgina", "Jumpy"), catCustomComparator));

    }
}
