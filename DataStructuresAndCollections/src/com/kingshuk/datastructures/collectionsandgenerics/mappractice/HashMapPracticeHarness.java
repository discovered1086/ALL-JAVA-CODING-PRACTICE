package com.kingshuk.datastructures.collectionsandgenerics.mappractice;

import java.util.Map;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonMapGenerator;

/**
 * Hash Map practice
 * Created by CO21321 on 2/2/2018.
 */
public class HashMapPracticeHarness {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = CommonMapGenerator.getHashMapOfEmployees();

        System.out.println("The employee IDs are...\n______________________________________\n");
        //Printing the keys first
        for (Integer keys : employeeMap.keySet()) {
            System.out.println(keys);
        }

        System.out.println("\n The names are...\n____________________________________________\n");
        //printing the values
        for (String name : employeeMap.values()) {
            System.out.println(name);
        }

        System.out.println("\n The key value pairs are...\n_______________________________________\n");
        //printing the keys and values
        for (Map.Entry<Integer, String> stringEntry : employeeMap.entrySet()) {
            //System.out.println("The key is " + stringEntry.getKey() + " and the value is " + stringEntry.getValue());
            //The below one also does the same thing as the above
            System.out.println("The key is " + stringEntry.getKey() + " and the value is " + employeeMap.get(stringEntry.getKey()   ));
        }

        //Now we can also get all the keys and/or values separately at one shot like below
        System.out.println("\n The whole set of keys are... "+employeeMap.keySet());
        System.out.println("\n The whole set of values are...  "+employeeMap.values());
    }
}
