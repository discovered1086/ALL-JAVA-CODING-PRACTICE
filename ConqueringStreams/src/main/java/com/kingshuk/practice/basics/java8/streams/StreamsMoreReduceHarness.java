package com.kingshuk.practice.basics.java8.streams;

import java.util.List;
import java.util.Optional;

import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class StreamsMoreReduceHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();

		// Get the oldest person from the list
		Optional<Integer> maxAge = personList.stream()
					.map(Person::getAge)
					.max((age1, age2) -> age1 > age2 ? 1 : -1);

		System.out.println(personList);

		System.out.println("Maximum age of anyone in the list is: " + 
					(maxAge.isPresent() ? maxAge.get() : 0));
		
		
		// Get the oldest person from the list
		Optional<Integer> minAge = personList.stream()
							.map(Person::getAge)
							.min((age1, age2) -> age1 > age2 ? 1 : -1);


				System.out.println("Minimum age of anyone in the list is: " + 
							(minAge.isPresent() ? minAge.get() : 0));
	}

}
