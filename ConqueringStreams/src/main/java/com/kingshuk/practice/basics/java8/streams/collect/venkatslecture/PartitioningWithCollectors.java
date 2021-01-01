package com.kingshuk.practice.basics.java8.streams.collect.venkatslecture;

import com.kingshuk.practice.basics.java8.streams.Person;
import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
				.collect(Collectors.partitioningBy(person -> person.getAge() % 2 == 0));

		System.out.println(listMap);
    }

}