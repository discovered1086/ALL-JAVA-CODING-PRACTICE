package mypractice.collectionsandgenerics.setpractice;

import mypractice.collectionsandgenerics.collectionelements.Dog;
import mypractice.collectionsandgenerics.sortingpractice.comparators.FixStringBufferComparator;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/** This class is to practice sorting with TreeSet
 * Created by CO21321 on 1/30/2018.
 */
public class SortingWithTreeSet {

    public static void main(String[] args) {
        Set<Dog> setOfDogs=new HashSet<>(CommonCollectionGenerator.getListOfDogObjects());

        System.out.println("Printing the dog names using the Hash Set \n");
        for (Dog dog : setOfDogs) {
            System.out.println(dog.getBreed());
        }

        System.out.println("_____________________________________________________________");

        Set<Dog> secondSetOfDogs=new TreeSet<>(CommonCollectionGenerator.getListOfDogObjects());
        System.out.println("Printing the dog names using the Tree Set \n");
        for (Dog dog : secondSetOfDogs) {
            System.out.println(dog.getBreed());
        }

        System.out.println("\n _____________________________________________________________");


        //Trying to use a List of String buffers with Hash Set and Tree Set
        Set<StringBuffer> setOfHashBuffers =new HashSet<>();

        setOfHashBuffers.addAll(CommonCollectionGenerator.getListOfStringBuffers());

        System.out.println("Printing String Buffers using the Hash Set \n");
        for (StringBuffer buffer : setOfHashBuffers) {
            System.out.println(buffer.toString());
        }

        System.out.println("_____________________________________________________________");


        /**
         * The below part of the code throws a ClassCastException.
         * Reason being that every class we have sorted so far (Strings, Integers) have
         * all internal implementation of the Comparable interface.
         *
         * For a tree set since it automatically sorts objects, if it doesn't find
         * any implementation of Comparable, it can't sort them automatically.
         *
         * StringBuffer doesn't have any implementations of the Comparable interface
         * So as a result it throws class cast exception
         */
        /*Set<StringBuffer> setOfTreeBuffers =new TreeSet<>();

        setOfTreeBuffers.addAll(CommonListGenerator.getListOfStringBuffers());

        System.out.println("Printing String Buffers using the Tree Set \n");
        for (StringBuffer buffer : setOfTreeBuffers) {
            System.out.println(buffer.toString());
        }*/

        /**
         * So how do we fix this problem. Any class that doesn't have an implementation
         * of Comparable interface should use custom comparator. Even we can use custom
         * comparator on classes that have implementation of the Comparable interface.
         *
         * Custom comparators give us a lot of flexibility in terms of using them on the fly by swapping
         * in and out the comparators we want to use for different purposes. We can have two custom comparators
         * say for an Employee object's name and salary fields so when we actually need to sort them by salary or
         * name, we can dynamically swap in and out the custom comparator classes to perform the sorting as we need.
         *
         * Below is how we fix the problem of sorting string buffers
         */

        Set<StringBuffer> setOfTreeBuffers =new TreeSet<>(new FixStringBufferComparator());

        setOfTreeBuffers.addAll(CommonCollectionGenerator.getListOfStringBuffers());

        System.out.println("Printing String Buffers using the Tree Set \n");
        for (StringBuffer buffer : setOfTreeBuffers) {
            System.out.println(buffer.toString());
        }

    }
}
