package com.kingshuk.practice.basics.java8.streams;

import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.TreeMap;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

public class SortingWithStreamsHarness {

    public static void main(String[] args) {
        List<Person> personList = StreamsPracticeUtil.getExpandedList();

        System.out.println(personList.stream()
                .sorted(comparing(Person::getAge))
                .map(Person::getName).collect(toList())
        );

        TreeMap<Integer, List<String>> groups = personList.stream()
                .collect(groupingBy(Person::getAge,
                        TreeMap::new,
                        mapping(Person::getName, toList())));

        System.out.println(groups);

        //Let's say we want to sort the list of persons first by age and
        // then by name, we can chain the comparing() methods.
        System.out.println(personList.stream()
                .sorted(comparing(Person::getAge)
                        .thenComparing(Person::getName))
                .collect(toList())
        );
    }
}
