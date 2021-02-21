package com.kingshuk.corejava.generics.inheritance;

import com.kingshuk.corejava.generics.inheritance.model.Animal;
import com.kingshuk.corejava.generics.inheritance.model.Cat;
import com.kingshuk.corejava.generics.inheritance.model.Dog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class AnimalBehavior<Animal> {

    public void animalBehavior() {
        System.out.println("Animal behaves");
    }
}

class AnimalLocation<T extends Animal> {

    public void animalLocation(T animal) {
        System.out.println(animal + "Animal resides in India");
    }
}

public class GenericsInheritanceTest {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tommy", "Spaniel"));
        animals.add(new Cat("Rai"));

        System.out.println("The Animals are: \n" + animals);

        animals.forEach(Animal::eats);

        AnimalBehavior<Dog> animalBehavior = new AnimalBehavior<>();
        animalBehavior.animalBehavior();

        //But seems it can take anything so this is not really proper typing
        AnimalBehavior<Date> animalBehavior2 = new AnimalBehavior<>();
        animalBehavior2.animalBehavior();

        AnimalLocation<Dog> animalLocation = new AnimalLocation<>();
        animalLocation.animalLocation(new Dog("Lucy", "German shepherd"));
    }
}
