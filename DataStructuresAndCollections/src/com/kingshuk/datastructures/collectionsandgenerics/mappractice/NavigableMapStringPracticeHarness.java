package com.kingshuk.datastructures.collectionsandgenerics.mappractice;

import java.util.NavigableMap;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonMapGenerator;

/**
 * This class is to practice Navigable Map methods and features
 * This is also solution to Bharath's assignment
 * Created by CO21321 on 2/6/2018.
 */
public class NavigableMapStringPracticeHarness {
    public static void main(String[] args) {
        NavigableMap<String, String> employeeNavigableMap= CommonMapGenerator.getNavigableMapOfEmployees();

        //Printing everything related to the key Map of the map

        System.out.println("Printing the entire map "+employeeNavigableMap.keySet());

        System.out.println("The greatest employee (string value) less than or equal to \"232649 \" " +
                "in the Map is "+ employeeNavigableMap.floorKey("232649"));

        System.out.println("The greatest employee (string value) less than or equal to \"2569892 \" " +
                "in the Map is "+ employeeNavigableMap.floorKey("2569892"));

        System.out.println("The greatest employee (string value) less than \"232649 \" " +
                "in the Map is "+ employeeNavigableMap.lowerKey("232649"));

        System.out.println("The smallest employee (string value) greater than \"2545464 \" " +
                "in the Map is "+employeeNavigableMap.higherKey("2545464"));

        System.out.println("The smallest employee (string value) greater than or equal to \"548587 \" " +
                "in the Map is "+ employeeNavigableMap.ceilingKey("548587"));

        System.out.println("The smallest employee (string value) greater than or equal to \"598784 \" " +
                "in the Map is "+ employeeNavigableMap.ceilingKey("598784"));

        System.out.println("Printing the entire key Map of the map in descending order "+ employeeNavigableMap.descendingKeySet());

        //Now it's time to print everything related to the complete entries
        System.out.println("____________________________________________________________________\n");

        System.out.println("Printing the entire map "+employeeNavigableMap);

        System.out.println("The greatest employee entry (string value) less than or equal to \"232649 \" " +
                "in the Map is "+ employeeNavigableMap.floorEntry("232649"));

        System.out.println("The greatest employee entry (string value) less than or equal to \"2569892 \" " +
                "in the Map is "+ employeeNavigableMap.floorEntry("2569892"));

        System.out.println("The greatest employee entry (string value) less than \"232649 \" " +
                "in the Map is "+ employeeNavigableMap.lowerEntry("232649"));

        System.out.println("The smallest employee entry (string value) greater than \"2545464 \" " +
                "in the Map is "+employeeNavigableMap.higherEntry("2545464"));

        System.out.println("The smallest employee entry (string value) greater than or equal to \"548587 \" " +
                "in the Map is "+ employeeNavigableMap.ceilingEntry("548587"));

        System.out.println("The smallest employee entry (string value) greater than or equal to \"598784 \" " +
                "in the Map is "+ employeeNavigableMap.ceilingEntry("598784"));

        System.out.println("Printing the entire map in descending order "+ employeeNavigableMap);

        //Now checking what happens when the string key we pass in is indeed at either end of the Map
        //All of them return null but doesn't throw any exception or anything
        System.out.println("_______________________________________________________________________________\n");

        System.out.println("The greatest employee (string value) less than \"205489 \" " +
                "in the Map is "+ employeeNavigableMap.lowerKey("205489"));

        System.out.println("The smallest employee entry (string value) greater than \"598785 \" " +
                "in the Map is "+ employeeNavigableMap.higherKey("598785"));

        System.out.println("The greatest employee (string value) less than or equal to \"205488 \" " +
                "in the Map is "+ employeeNavigableMap.floorKey("205488"));

        System.out.println("The smallest employee entry (string value) greater than or equal to \"598786 \" " +
                "in the Map is "+ employeeNavigableMap.ceilingKey("598786"));

        //The poll methods, they remove and return the first and last number in the Map with PollFirst and PollLast respectively
        System.out.println("_______________________________________________________________________________\n");

        System.out.println("Polling the first element of the Map "+employeeNavigableMap.pollFirstEntry());

        System.out.println("Polling the last element of the Map "+employeeNavigableMap.pollLastEntry());

        System.out.println("Printing the entire Map again after using pollFirst() and pollLast() "+employeeNavigableMap);
    }
}
