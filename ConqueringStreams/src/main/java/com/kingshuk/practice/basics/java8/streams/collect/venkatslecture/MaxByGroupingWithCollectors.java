package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class MaxByGroupingWithCollectors {

    public static void main(String[] args) {
        List<Person> personList = StreamsPracticeUtil.getExpandedList();

        //Let's say we want to get a sum of all the ages of the persons
        //We could do it in two ways
        System.out.println(personList.stream()
                .map(Person::getAge)
                .reduce(0, Integer::sum));

        //A bit more specialization
        System.out.println(personList.stream()
                .mapToInt(Person::getAge)
                .sum());

        //The max operation
        System.out.println(personList.stream()
                .mapToInt(Person::getAge)
                .max());

        //Get the oldest person in the group
        //#1
        System.out.println(personList.stream()
                .collect(maxBy(comparing(Person::getAge))));

        //#2
        System.out.println(personList.stream().max(comparing(Person::getAge)));

        //Get the youngest person in the group
        //#1
        System.out.println(personList.stream()
                .collect(minBy(comparing(Person::getAge))));

        //#2
        System.out.println(personList.stream().min(comparing(Person::getAge)));

        //Get the name of the oldest person the group
        String name = personList.stream()
                .collect(collectingAndThen(
                        maxBy(comparing(Person::getAge)),
                        optionalPerson -> optionalPerson.map(Person::getName).orElse("")));

        System.out.println("The oldest person in the group is: " + name);
    }

}