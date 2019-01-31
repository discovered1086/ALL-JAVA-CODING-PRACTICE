package com.kingshuk.datastructures.collectionsandgenerics.sortingpractice.comparators;

import java.util.Comparator;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.Animal;

/** A generic interface for the Animal Comparator
 * Created by CO21321 on 1/31/2018.
 */
public interface AnimalCustomComparator<T extends Animal> extends Comparator<T> {
}
