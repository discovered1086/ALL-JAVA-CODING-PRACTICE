package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice;

import java.util.Collections;
import java.util.List;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.Cat;
import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.Dog;
import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.AnimalCustomComparator;
import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.CatCustomComparator;
import com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators.DogCustomComparator;
import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/** Harness class for testing comparators
 * Created by CO21321 on 1/31/2018.
 */
public class AnimalCustomComparatorHarness {

    public static void main(String[] args) {
        //Sorting the cat objects using a list
        List<Cat> catList= CommonCollectionGenerator.getListOfCatObjects();

        List<Dog> dogList= CommonCollectionGenerator.getListOfDogObjects();

        AnimalCustomComparatorHarness catCustomComparator=new AnimalCustomComparatorHarness();

        AnimalCustomComparator<Dog> dogCustomComparator=new DogCustomComparator();

        

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
