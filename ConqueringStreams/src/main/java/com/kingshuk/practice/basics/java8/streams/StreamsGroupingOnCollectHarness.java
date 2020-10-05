package com.kingshuk.practice.basics.java8.streams;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;

import com.kingshuk.practice.basics.java8.streams.util.StreamsPracticeUtil;

public class StreamsGroupingOnCollectHarness {

	public static void main(String[] args) {
		List<Person> personList = StreamsPracticeUtil.getPersonList();
		
		//Collecting a map of the person and the key is the name of the person
		Map<String, List<Person>> map = personList.stream()
					.collect(groupingBy(Person::getName));
		
		map.forEach((k,v) -> System.out.println(k+" -- " +v));
		
	}

}
