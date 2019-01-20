package com.kingshuk.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterNameWithStreamHarness {
    public static void main(String[] args) {
        //Predicate<String> filterNames = (name) -> name.contains("King");

        List<String> nameList= new ArrayList<>();
        nameList.add("Kingshuk");
        nameList.add("Joshua King");
        nameList.add("Anthony Lambert");
        nameList.add("Karen McDougal");

        System.out.println(nameList);

        /**
         * Here the below step is the configuration part where we're telling
         * the stream what it should do
         */
        Stream<String> nameStream= nameList.stream().filter((name) -> name.contains("King"));

        /**
         * Below is the processing part. Where the stream does what it has been told to
         * do. In this case filter out the names having the word 'King' and
         * creating a separate list out of that.
         */
        List<String> nameResultList = nameStream.collect(Collectors.toList());

        System.out.println(nameResultList);
    }
}
