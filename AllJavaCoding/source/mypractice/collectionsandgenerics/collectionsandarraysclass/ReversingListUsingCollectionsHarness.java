package mypractice.collectionsandgenerics.collectionsandarraysclass;

import mypractice.collectionsandgenerics.collectionelements.Dog;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.Collections;
import java.util.List;

/** Class to practice reversing of a list using Collections methods
 * Created by CO21321 on 2/7/2018.
 */
public class ReversingListUsingCollectionsHarness {
    public static void main(String[] args) {
        List<Integer> listOfNumbers= CommonCollectionGenerator.getListOfRandomNumbers();

        System.out.println("The list of numbers BEFORE reversing \n " + listOfNumbers);

        Collections.reverse(listOfNumbers);

        System.out.println("_____________________________________________________________________\n"+
                "The list of numbers AFTER reversing \n " + listOfNumbers);

        List<String> listOfNames=CommonCollectionGenerator.getListOfNames();

        System.out.println("_____________________________________________________________________\n"+
                "The list of names BEFORE reversing \n " + listOfNames);

        Collections.reverse(listOfNames);

        System.out.println("_____________________________________________________________________\n"+
                "The list of names AFTER reversing \n " + listOfNames);

        List<Dog> listOfObjects=CommonCollectionGenerator.getListOfDogObjects();

        System.out.println("_____________________________________________________________________\n"+
                "The list of dog objects BEFORE reversing \n " + listOfObjects);

        Collections.reverse(listOfObjects);

        System.out.println("_____________________________________________________________________\n"+
                "The list of dog objects AFTER reversing \n " + listOfObjects);
    }
}
