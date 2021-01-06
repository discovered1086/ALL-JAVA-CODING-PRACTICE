package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.stream.Collectors.*;

public class GroupingWithCollectors {

    public static void main(String[] args) {
        List<Person> personList = StreamsPracticeUtil.getExpandedList();

        //Can we group the list of people into different groups by their age group??

        //Imperative style this is what we would write
//        Map<Integer, List<Person>> ageGroupMap = new HashMap<>();
//
//        for (Person person : personList) {
//            List<Person> people = null;
//            if (ageGroupMap.containsKey(person.getAge())) {
//                people = ageGroupMap.get(person.getAge());
//                people.add(person);
//            } else {
//                people = new ArrayList<>();
//                people.add(person);
//                ageGroupMap.put(person.getAge(), people);
//            }
//        }

        Map<Integer, List<Person>> ageGroupMap = personList.stream()
                .collect(groupingBy(Person::getAge));

        System.out.println(ageGroupMap);

        Map<Integer, List<String>> nameByAge = personList.stream()
                .collect(groupingBy(Person::getAge,
                         mapping(Person::getName, toList())));

        System.out.println(nameByAge);

        Map<Integer, Set<String>> nameByAge2 = personList.stream()
                .collect(groupingBy(Person::getAge,
                        mapping(Person::getName, toSet())));


        System.out.println(nameByAge2);
    }

}