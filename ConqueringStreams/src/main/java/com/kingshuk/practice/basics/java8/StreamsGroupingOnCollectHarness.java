package com.kingshuk.practice.basics.java8;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.*;

public class StreamsGroupingOnCollectHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeHarness.getPersonList();
		
		//Collecting a map of the person and the key is the name of the person
		Map<String, List<Person>> map = personList.stream()
					.collect(groupingBy(Person::getName));
		
		map.forEach((k,v) -> System.out.println(k+" -- " +v));
		
	}

}
