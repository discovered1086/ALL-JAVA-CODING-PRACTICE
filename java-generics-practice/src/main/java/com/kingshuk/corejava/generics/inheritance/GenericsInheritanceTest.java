package com.kingshuk.corejava.generics.inheritance;

import com.kingshuk.corejava.generics.inheritance.model.Animal;
import com.kingshuk.corejava.generics.inheritance.model.Cat;
import com.kingshuk.corejava.generics.inheritance.model.Dog;
import com.kingshuk.corejava.generics.inheritance.model.Lion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class AnimalBehavior<T> {

    public void animalBehavior(T animal) {
        System.out.println(String.format("Animal %s behaves", animal));
    }
}

class AnimalLocation<T extends Animal> {

    public void animalLocation(T animal) {
        System.out.println(animal + "Animal resides in India");
    }
}

public class GenericsInheritanceTest {

    public static void main(String[] args) {
        final Dog tommy = new Dog("Tommy", "Spaniel");
        final Cat rai = new Cat("Rai");
        final Dog lucy = new Dog("Lucy", "German shepherd");

        List<Animal> animals = new ArrayList<>();
        animals.add(tommy);
        animals.add(rai);

        System.out.println("The Animals are: \n" + animals);

        animals.forEach(Animal::eats);

        AnimalBehavior<Dog> dogBehavior = new AnimalBehavior<>();
        dogBehavior.animalBehavior(tommy);

        //But seems it can take anything so this is not really proper typing
//        AnimalBehavior<Date> animalBehavior2 = new AnimalBehavior<>();
//        animalBehavior2.animalBehavior(dog);

        //This is not allowed by the compiler
//        AnimalBehavior<Animal> animalBehavior2 = new AnimalBehavior<Dog>();
//        animalBehavior2.animalBehavior(lucy);

        //This is also not allowed by the compiler
        //printAnimalBehavior(dogBehavior);

        AnimalLocation<Dog> animalLocation = new AnimalLocation<>();
        animalLocation.animalLocation(lucy);

        List<Dog> dogs = Arrays.asList(lucy, tommy);
        List<Cat> cats = Collections.singletonList(rai);

        printAnimal(dogs);

        printAnimal(cats);
    }

    private static void printAnimal(List<Animal> animals){
        animals.forEach(System.out::println);
        animals.add(new Lion("Sher Khan"));
    }

    private static void printAnimalBehavior(AnimalBehavior<Animal> animalBehavior){
        System.out.println("The animal behavior is: "+animalBehavior);
    }


}
