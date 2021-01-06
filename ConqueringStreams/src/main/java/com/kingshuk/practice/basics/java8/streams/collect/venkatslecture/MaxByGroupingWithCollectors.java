package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;

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
    }

}