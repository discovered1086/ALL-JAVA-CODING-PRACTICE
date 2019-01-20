package mypractice.collectionsandgenerics;

import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.Iterator;
import java.util.ListIterator;

/**
 * This class is to practice iterators
 * Created by CO21321 on 1/30/2018.
 */
public class PracticingIterators {

    public static void main(String[] args) {

        Iterator<String> iterator = CommonCollectionGenerator.getListOfNames().iterator();

        System.out.println("Printing the names using the iterator \n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /**
         * Now let's check out the lis iterator. Using a list iterator we can go both forward and backward.
         * This can only be done on a List object.
         */

        System.out.println("_______________________________________________________________________");

        ListIterator<String> listIterator = CommonCollectionGenerator.getListOfNames().listIterator();
        System.out.println("Printing the names in the forward direction using the list iterator \n");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("_______________________________________________________________________");
        System.out.println("Printing the names in the backward direction using the list iterator \n");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
