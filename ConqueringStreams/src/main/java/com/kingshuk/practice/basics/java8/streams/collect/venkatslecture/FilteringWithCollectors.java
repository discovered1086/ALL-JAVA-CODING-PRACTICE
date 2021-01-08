package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class FilteringWithCollectors {

    public static void main(String[] args) {
        List<Person> personList = StreamsPracticeUtil.getExpandedList();

        Map<Integer, Set<String>> nameByAge2 = personList.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName, toSet())));


        System.out.println(nameByAge2);

        Map<Integer, Set<String>> nameByAge3 = personList.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName,
                                filtering(name -> name.length() <= 4, toSet()))));


        System.out.println(nameByAge3);
    }

}