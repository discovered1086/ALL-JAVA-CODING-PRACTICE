package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStreamPractice {

	public static void main(String[] args) {
		List<String> actorNames = Arrays.asList("Leonardo DiCaprio",
				"Brad Pitt", "Bradley Cooper", "Sylvester Stallone",
				"Al Pacino");
		
		System.out.println("List according to insertion order: \n "+actorNames+"\n");
		
		System.out.println("List according to default natural sorting order:\n"+
					actorNames.stream().sorted().collect(Collectors.toList())+"\n");
		
		System.out.println("List according to descending sorting order:\n"+
				actorNames.stream().sorted((s1,s2) -> s2.compareTo(s1))
				.collect(Collectors.toList())+"\n");
		
		System.out.println("List according to descending sorting order - "+
				"different comparator:\n"+
				actorNames.stream().sorted((s1,s2) -> -s1.compareTo(s2))
				.collect(Collectors.toList()));
	}

}
