package com.kingshuk.corejava.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsTypeErasureDemo {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        addNames(names, "Kingshuk");
        addNames(names, "Deeksha");
        System.out.println(names);
        addNamesIncorrectWay(names, 200);
        System.out.println(names);
        String names3 = names.get(2);
    }

    private static void addNames(List<String> names, String name){
        names.add(name);
    }

    public static void addNamesIncorrectWay(List list, Integer value){
        list.add(value);
    }
}
