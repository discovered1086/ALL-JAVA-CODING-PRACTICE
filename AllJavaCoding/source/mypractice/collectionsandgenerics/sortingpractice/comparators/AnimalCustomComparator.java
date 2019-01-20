package mypractice.collectionsandgenerics.sortingpractice.comparators;

import mypractice.collectionsandgenerics.collectionelements.Animal;

import java.util.Comparator;

/** A generic interface for the Animal Comparator
 * Created by CO21321 on 1/31/2018.
 */
public interface AnimalCustomComparator<T extends Animal> extends Comparator<T> {
}
