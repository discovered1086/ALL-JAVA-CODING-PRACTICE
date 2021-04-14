package com.kingshuk.corejava.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class WildCardBoundsDemo {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1,5645,878,968);

        List<Double> doubles = Arrays.asList(45.00, 5689.23, 7845.45, 7895.48);

        printNumbers(integers);

        printNumbers(doubles);
    }

    private static void printNumbers(List<? extends Number> numbers){
        numbers.forEach(System.out::println);

        //final Number number = numbers.get(0);
    }


}
