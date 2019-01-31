package com.kingshuk.datastructures.collectionsandgenerics.genericspractice;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.*;
import com.kingshuk.datastructures.collectionsandgenerics.genericselements.RestrictedGenericClass;

/**A class to practice generics restriction
 * Created by CO21321 on 2/8/2018.
 */
public class RestrictedGenericHarness {
    public static void main(String[] args) {
        RestrictedGenericClass<Animal> newAnimalClass=new RestrictedGenericClass<>(new Animal("Black",null,null,null));

        RestrictedGenericClass<Dog> newDogClass=new RestrictedGenericClass<>(new Dog(true, "German Shepherd"));

        RestrictedGenericClass<Cat> newCatClass=new RestrictedGenericClass<>(new Cat("Nathan", "Jumpy"));

        /**
         * The bound says Whatever class we pass in has to be of type Animal, it'll restrict anything that's not
         * an animal by type
         */
        //RestrictedGenericClass<Manager> newEmployeeClass=new RestrictedGenericClass<>(new Manager());

        System.out.println(" The animal class is "+newAnimalClass);

        System.out.println(" The Dog class is "+newDogClass);

        System.out.println(" The Cat class is "+newCatClass);
    }
}
