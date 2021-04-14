package com.kingshuk.corejava.generics.wildcards.multiplebounds;


import com.kingshuk.corejava.generics.wildcards.multiplebounds.model.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultipleBoundsDemo {

    public static void main(String[] args) {
        final Dog tommy = new Dog("Tommy", "Spaniel");
        final Cat rai = new Cat("Rai");
        final Dog lucy = new Dog("Lucy", "German shepherd");
        final Lion simba = new Lion("Simba");

        List<Dog> dogs = Arrays.asList(lucy, tommy);
        List<Cat> cats = Collections.singletonList(rai);

        List<Lion> lions = Collections.singletonList(simba);

        printAnimal(dogs);

        printAnimal(cats);

        //printAnimal(lions);
    }

    private static <A extends Animal & IRun> void printAnimal(List<A> animals){
        animals.forEach(animal -> {
            animal.eats();
            animal.runs();
        });
    }

//    private static void printAnimal2(List<? extends Animal & IRun> animals){
//        animals.forEach(Animal::eats);
//    }
}
