package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class FlatMappingHarness {

    public static void main(String[] args) {
        List<Person> expandedList = StreamsPracticeUtil.getExpandedList();

        //Give me the list of characters in the name
        List<String> charactersInNames = expandedList.stream()
                .map(Person::getName)
                .flatMap(name -> Stream.of(name.split("")))
                .collect(toList());

        System.out.println(charactersInNames);

        Map<Integer, List<String>> characterMap = expandedList.stream()
                .collect(groupingBy(Person::getAge,
                        flatMapping(person -> Stream.of(person.getName().split("")), toList())));

        System.out.println(characterMap);

        //Unique characters in upper case style 1
        Map<Integer, Set<String>> characterMap2 = expandedList.stream()
                .collect(groupingBy(Person::getAge,
                        flatMapping(person -> Stream.of(person.getName().toUpperCase().split("")), toSet())));

        System.out.println(characterMap2);

        //Unique characters in upper case style 2
        Map<Integer, Set<String>> characterMap3 = expandedList.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(person -> person.getName().toUpperCase(),
                                flatMapping(name -> Stream.of(name.split("")), toSet()))));

        System.out.println(characterMap3);

    }
}
