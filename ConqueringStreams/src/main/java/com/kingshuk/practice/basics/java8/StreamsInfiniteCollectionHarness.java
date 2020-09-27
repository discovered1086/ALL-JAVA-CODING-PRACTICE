package com.kingshuk.practice.basics.java8;

import java.util.stream.Stream;

public class StreamsInfiniteCollectionHarness {

	public static void main(String[] args) {
		Stream.iterate(1, e -> e + 1)
		.filter(e -> e%2 != 0)
		.limit(15)
		.forEach(System.out::println);
	}

}
