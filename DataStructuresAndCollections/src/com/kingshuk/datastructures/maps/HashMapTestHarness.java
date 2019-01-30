package com.kingshuk.datastructures.maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapTestHarness {

    public static void main(String[] args) {
        Map<Integer, String> employeeMap=new HashMap<>();

        employeeMap.put(1, "Kingshuk");
        employeeMap.put(2, "Darren");
        employeeMap.put(3, "Maria");
        employeeMap.put(4, "Nandan");
        employeeMap.put(5, "Brian");
        employeeMap.put(6, "Steve");

        System.out.println(employeeMap);

        System.out.println(employeeMap.values());

        System.out.println(employeeMap.keySet());

        System.out.println(employeeMap.entrySet());

        System.out.println(employeeMap.remove(4));
    }
}
