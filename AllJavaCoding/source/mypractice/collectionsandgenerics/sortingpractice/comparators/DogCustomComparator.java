package mypractice.collectionsandgenerics.sortingpractice.comparators;

import mypractice.collectionsandgenerics.collectionelements.Dog;

/** A custom comparator class for the dog objects
 * Created by CO21321 on 1/31/2018.
 */
public class DogCustomComparator implements AnimalCustomComparator<Dog> {

    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.compareTo(dog2);
    }
}
