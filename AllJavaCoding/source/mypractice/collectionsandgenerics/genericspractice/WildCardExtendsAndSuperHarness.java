package mypractice.collectionsandgenerics.genericspractice;

import mypractice.collectionsandgenerics.collectionelements.Animal;
import mypractice.collectionsandgenerics.collectionelements.Cat;
import mypractice.collectionsandgenerics.utility.CommonCollectionGenerator;

import java.util.List;

/**
 * This is to practice wild card behavior for super and extends
 * Created by CO21321 on 2/8/2018.
 */
public class WildCardExtendsAndSuperHarness {
    public static void main(String[] args) {
        List<Cat> catList = CommonCollectionGenerator.getListOfCatObjects();

        List<Animal> animalList = CommonCollectionGenerator.getListOfCatObjectsForGenerics();

        addMoreAnimalWithSuper(animalList);

        System.out.println("The updated cat list is "+animalList);
    }

    /**
     * The below method addMoreAnimals is not allowed because of obvious reasons,
     * If I'm allowing a list with any kind of animal (Any sub class of Animal) to come in
     * the method, I can try to add any kind of animal object , like a dog or cat object in the list and thus
     * type-contaminate it.
     *
     *
     * But I can do the other way around with addMoreAnimalWithSuper method,
     * Here basically what I'm saying is, A list with any type of super class of Cat can come in (Of course that includes
     * the Cat class itself) thus preserving type-safety. Because we know for sure any object which has Cat as sub class,
     * is essentially a Cat, meaning it stays within the linear hierarchy
     */


    /**
     * Another good point to practice here is that
     * private static void addMoreAnimals(List<? extends Animal> animals)
     *
     * is same as
     *
     * private static <T extends Animal> void addMoreAnimalWithSuper(List<T> animals)
     *
     * It's not gonna work on private static void addMoreAnimalWithSuper(List<? super Cat> animals)
     *
     * "T CAN'T BE USED WITH SUPER, IT ALWAYS HAS TO BE USED WITH WILDCARDS"
     */
    private static void addMoreAnimals(List<? extends Animal> animals) {
        //animals.add(new Cat("Jimmy","angry"));
    }

    private static void addMoreAnimalWithSuper(List<? super Cat> animals) {
        animals.add(new Cat("Mandy", "quite"));
    }
}
