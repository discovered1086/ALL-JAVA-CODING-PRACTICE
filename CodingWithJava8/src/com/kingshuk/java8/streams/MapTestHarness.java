package com.kingshuk.java8.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MapTestHarness {
    public static void main(String[] args) {
        List<String> bookNameList= new ArrayList<>();
        bookNameList.add("howToPrepareForOCEJWCD");
        bookNameList.add("eBookJava8");
        bookNameList.add("eCertificateOCEJWCD");
        bookNameList.add("IamLion");

        List<String> bookFileNames = bookNameList.stream().map(s -> s + ".pdf").collect(Collectors.toList());

        //System.out.println("The names of the eBooks available are\n"+bookFileNames);

        System.out.println("The names of the eBooks available are\n");

        bookFileNames.stream().forEach(System.out::println);

        Comparator<String> stringComparator = (s1, s2) -> (s2.compareTo(s1));

        System.out.println("\n The sorted list is\n"+bookFileNames.stream().sorted(stringComparator).collect(Collectors.toList()));

        System.out.println("\n The final element in this list is \n"+bookFileNames.stream().max(stringComparator).get());

        System.out.println("\n The first element in this list is \n"+bookFileNames.stream().min(stringComparator).get());
    }
}
