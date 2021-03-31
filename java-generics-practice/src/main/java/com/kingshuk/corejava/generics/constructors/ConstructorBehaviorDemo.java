package com.kingshuk.corejava.generics.constructors;

@SuppressWarnings({"unused", "java:S1854", "java:S1481", "unchecked", "rawtypes"})
public class ConstructorBehaviorDemo {

    public static void main(String[] args) {
        HouseHold<Person> houseHold = new HouseHold<>(new Person(), new Person());

        HouseHold<Person> houseHol2 = new HouseHold(new Person(), new Dog());

        //HouseHold<Dog> houseHol3 = new HouseHold<>(new Person(), new Person());
    }
}
