package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class PartitioningWithCollectors {

    public static void main(String[] args) {
        List<Person> personList = StreamsPracticeUtil.getExpandedList();

        //We have to split the group of people into two groups.
        // One with even number of age and another with odd number of age

//		List<Person> peopleEven = personList.stream()
//				.filter(person -> person.getAge() % 2 == 0)
//				.collect(Collectors.toList());
//
//		List<Person> peopleOdd = personList.stream()
//				.filter(person -> person.getAge() % 2 != 0)
//				.collect(Collectors.toList());
//
//		System.out.println(peopleEven);
//
//		System.out.println(peopleOdd);

        Map<Boolean, List<Person>> listMap = personList.stream()
                .collect(partitioningBy(person -> person.getAge() % 2 == 0));

        System.out.println(listMap);

        Map<Boolean, List<Person>> updatedPersons = personList.stream()
                .collect(partitioningBy(person -> person.getAge() % 2 == 0,
                        //filtering(person -> person.getAge() % 2 == 0,
                        mapping(person -> Person.builder()
                                .age(person.getAge())
                                .gender(person.getGender())
                                .name(person.getName().toUpperCase())
                                .build(), toList())));//);

        System.out.println(updatedPersons);


        //Very bad idea as we are iterating over the stream again in collectingAndThen
        final Map<Boolean, List<Person>> collect = personList.stream()
                .collect(partitioningBy(person -> person.getAge() % 2 == 0,
                        collectingAndThen(filtering(person -> person.getAge() % 2 == 0, toList()),
                                person2 -> person2.stream()
                                        .map(person -> Person.builder()
                                                .age(person.getAge())
                                                .gender(person.getGender())
                                                .name(person.getName().toUpperCase())
                                                .build())
                                        .collect(toList()))));

        System.out.println(collect);

        for (Person person : personList) {
            if (person.getAge() % 2 == 0) {
                person.setName(person.getName().toUpperCase());
            } else {
                person.setName(person.getName().toLowerCase());
            }
        }

        System.out.println(personList);
    }

}