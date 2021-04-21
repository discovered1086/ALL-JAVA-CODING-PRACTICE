package com.kingshuk.corejava.generics.wildcards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LowerBoundDemo {
    private static final Logger logger = LoggerFactory.getLogger(LowerBoundDemo.class);

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 5645, 878, 968);

        List<Double> doubles = Arrays.asList(45.00, 5689.23, 7845.45, 7895.48);

        List<Number> numbers = new ArrayList<>();
        numbers.add(455);
        numbers.add(5645645.23);
        numbers.add(5478);

        printNumbers(integers);

        printNumbers(doubles);

        addNumbers(numbers, 45);

        addNumbers(numbers, 68476.5689);
    }

    private static void printNumbers(List<? extends Number> numbers) {
        numbers.forEach(number -> logger.info(String.valueOf(number)));

        //final Number number = numbers.get(0);
    }

    private static void addNumbers(List<? super Number> numbers, Number number) {
        numbers.add(number);
        logger.info("The list after adding {} is {}", number, numbers);
    }
}
