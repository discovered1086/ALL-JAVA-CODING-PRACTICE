package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.Cat;

/** A custom comparator class for the Cats
 * Created by CO21321 on 1/31/2018.
 */
public class CatCustomComparator implements AnimalCustomComparator<Cat>  {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
