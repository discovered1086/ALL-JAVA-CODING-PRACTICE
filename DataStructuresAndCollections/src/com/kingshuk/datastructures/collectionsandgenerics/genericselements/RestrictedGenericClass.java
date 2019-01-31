package com.kingshuk.datastructures.collectionsandgenerics.genericselements;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.Animal;

/** A class to practice generic restrictions
 * Created by CO21321 on 2/8/2018.
 */
public class RestrictedGenericClass<T extends Animal> {

    T animal;

    public RestrictedGenericClass(T animal) {
        this.animal = animal;
    }

    public T getAnimal() {
        return animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "RestrictedGenericPracticeHarness{" +
                "animal=" + animal +
                '}';
    }
}
