package com.kingshuk.practice.basics.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class FlatMapHarness {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4);

        //one-to-one function
        System.out.println(integers.stream()
                .map(n -> n*5)
                .collect(toList()));

        //This works like this
        //Stream<T>.map(f11) ===> Stream<R>

        //one-to-many function
        System.out.println(integers.stream()
                .map(n -> Arrays.asList(n*5, n*15, n*25))
                .collect(toList()));

        //This works like this
        //Stream<T>.map(f1n) ===> Stream<List<R>>

        //So what we actually want is
        //Stream<T>.???(f1n) ===> Stream<R>
        System.out.println(integers.stream()
                .flatMap(n -> Stream.of(n*5, n*15, n*25))
                .collect(toList()));

        //What does a map do?
        //Stream<T>.map(Function<T, R) ===> Stream<R>
        //And what does a flatmap do?
        //It returns a collection but that collection could be anything
        //Stream<T>.flatMap(Function<T,Stream<R>>)   ===> Stream<R>
    }
}
