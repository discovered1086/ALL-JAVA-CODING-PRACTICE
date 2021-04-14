package com.kingshuk.corejava.generics.wildcards;

import com.kingshuk.corejava.generics.inheritance.model.Animal;
import com.kingshuk.corejava.generics.inheritance.model.Cat;
import com.kingshuk.corejava.generics.inheritance.model.Dog;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WildCardUpperBoundDemo {

    public static void main(String[] args) {
        final Dog tommy = new Dog("Tommy", "Spaniel");
        final Cat rai = new Cat("Rai");
        final Dog lucy = new Dog("Lucy", "German shepherd");

        List<Dog> dogs = Arrays.asList(lucy, tommy);
        List<Cat> cats = Collections.singletonList(rai);

        printAnimal(dogs);

        printAnimal(cats);
    }

    private static void printAnimal(List<? extends Animal> animals){
        animals.forEach(Animal::eats);
    }


}
