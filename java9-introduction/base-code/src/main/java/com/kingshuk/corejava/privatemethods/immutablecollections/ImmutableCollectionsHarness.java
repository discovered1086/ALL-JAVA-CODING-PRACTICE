package com.kingshuk.corejava.privatemethods.immutablecollections;

import java.util.*;

public class ImmutableCollectionsHarness {

    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("Kingshuk");
        mySet.add("Amit");
        mySet.add("Mainak");

        Set<String> stringSet = Collections.unmodifiableSet(mySet);

        System.out.println(stringSet);

        //Instead we could do this.

        Set<String> strings = Set.of("Kingshuk", "Amit", "Mainak");

        System.out.println(strings);

        List<String> stringList = List.of("Kingshuk", "Amit", "Mainak");

        System.out.println(stringList);

        Map<String, Integer> integerMap = Map.of("Kingshuk", 200, "Amit", 400, "Mainak", 600);

        System.out.println(integerMap);

        Map<String, Integer> ofEntries = Map.ofEntries(Map.entry("Kingshuk", 560), Map.entry("Amit", 400), Map.entry("Mainak", 700));

        System.out.println(ofEntries);
    }
}
