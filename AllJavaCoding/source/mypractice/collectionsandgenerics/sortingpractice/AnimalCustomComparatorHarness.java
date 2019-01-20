package mypractice.collectionsandgenerics.sortingpractice;

import mypractice.collectionsandgenerics.collectionelements.Cat;
import mypractice.collectionsandgenerics.collectionelements.Dog;
import mypractice.collectionsandgenerics.sortingpractice.comparators.AnimalCustomComparator;
import mypractice.collectionsandgenerics.sortingpractice.comparators.CatCustomComparator;
import mypractice.collectionsandgenerics.sortingpractice.comparators.DogCustomComparator;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.Collections;
import java.util.List;

/** Harness class for testing comparators
 * Created by CO21321 on 1/31/2018.
 */
public class AnimalCustomComparatorHarness {

    public static void main(String[] args) {
        //Sorting the cat objects using a list
        List<Cat> catList= CommonCollectionGenerator.getListOfCatObjects();

        List<Dog> dogList= CommonCollectionGenerator.getListOfDogObjects();

        AnimalCustomComparator<Cat> catCustomComparator=new CatCustomComparator();

        AnimalCustomComparator<Dog> dogCustomComparator=new DogCustomComparator();

        Collections.sort(catList, catCustomComparator);

        System.out.println("The sorted cat objects are \n");

        for (Cat cat : catList) {
            System.out.println(cat.getName());
        }

        System.out.println("_____________________________________________________");

        System.out.println("The sorted dog objects are \n");

        Collections.sort(dogList, dogCustomComparator);

        for (Dog dog : dogList) {
            System.out.println(dog.getBreed());
        }
    }
}
