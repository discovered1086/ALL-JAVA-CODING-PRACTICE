package mypractice.collectionsandgenerics.sortingpractice;

import mypractice.collectionsandgenerics.collectionelements.Dog;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 5/5/13
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionsSortHarness {

    public static void main(String[] args) {
        List<Dog> animals = CommonCollectionGenerator.getListOfDogObjects();

        /*The below sort method doesn't need any Comparator objects to be passed
        * Because it's sorting a list of Dog objects and we have implemented the comparable interface in
        * the dog object.
        *
        * If we remove it, this sort method will throw an error
        *
        * Bottom line is sort method on collection needs at least one of the implementation
        * for the object it's trying to sort
        * a) The object being sorted has implemented comparable or
        * b) An implementation of Comparator is passed in the sort method
        */

        Collections.sort(animals);

        for (Dog a : animals) {
           System.out.println("The breed name is: " + a.getBreed());
        }
    }


}
