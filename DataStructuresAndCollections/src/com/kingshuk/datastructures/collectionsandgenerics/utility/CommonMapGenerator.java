package com.kingshuk.datastructures.collectionsandgenerics.utility;

import java.util.*;

/**
 * This class generates random collections and generics to
 * facilitate actual processing on them by other classes
 * Created by CO21321 on 1/30/2018.
 */
public class CommonMapGenerator {

    public static Map<Integer, String> getHashMapOfEmployees() {
        Map<Integer, String> employeeMap = new HashMap<>();

        employeeMap.put(232649,"Kingshuk");
        employeeMap.put(2545465,"Ramesh");
        employeeMap.put(564564,"Darren");
        employeeMap.put(598785,"Jen");
        employeeMap.put(548587,"Craig");
        employeeMap.put(232649,"Deeksha");
        employeeMap.put(232649,"Reyan");

        return employeeMap;
    }

    public static Map<Integer, String> getLinkedHashMapOfEmployees() {
        Map<Integer, String> employeeMap = new LinkedHashMap<>();

        employeeMap.put(232649,"Kingshuk");
        employeeMap.put(2545465,"Ramesh");
        employeeMap.put(564564,"Darren");
        employeeMap.put(598785,"Jen");
        employeeMap.put(548587,"Craig");
        employeeMap.put(232649,"Deeksha");
        employeeMap.put(232649,"Reyan");

        return employeeMap;
    }

    public static Map<Integer, String> getIdentityHashMapOfEmployees() {
        Map<Integer, String> employeeMap = new IdentityHashMap<>();

        employeeMap.put(232649,"Kingshuk");
        employeeMap.put(2545465,"Ramesh");
        employeeMap.put(564564,"Darren");
        employeeMap.put(598785,"Jen");
        employeeMap.put(548587,"Craig");
        employeeMap.put(232649,"Deeksha");
        employeeMap.put(232649,"Reyan");

        return employeeMap;
    }


    public static NavigableMap<String, String> getNavigableMapOfEmployees() {
        NavigableMap<String, String> employeeMap = new TreeMap<>();

        employeeMap.put(String.valueOf(232649),"Kingshuk");
        employeeMap.put(String.valueOf(2545465),"Ramesh");
        employeeMap.put(String.valueOf(564564),"Darren");
        employeeMap.put(String.valueOf(598785),"Maria");
        employeeMap.put(String.valueOf(548587),"Craig");
        employeeMap.put(String.valueOf(205489),"Jennifer");
        employeeMap.put(String.valueOf(214589),"Reyan");

        return employeeMap;
    }

}
