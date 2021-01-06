package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class OperatingOnGroupingWithCollectors {

    public static void main(String[] args) {
        List<Person> personList = StreamsPracticeUtil.getExpandedList();

       //Let's say we want to count how many people are there for
        // each of the ages in the persons list
        Map<Integer, Long> countByAge = personList.stream()
                .collect(groupingBy(Person::getAge, counting()));

        System.out.println(countByAge);

        Map<Integer, Integer> countByAge2 = personList.stream()
                .collect(groupingBy(Person::getAge, collectingAndThen(counting(), Long::intValue)));

        System.out.println(countByAge2);
    }

}