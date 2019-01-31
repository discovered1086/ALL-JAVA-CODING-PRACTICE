package com.kingshuk.datastructures.collectionsandgenerics.mappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

import com.kingshuk.datastructures.collectionsandgenerics.collectionelements.WeakHashMapEmployee;

/** This class is to practice weak hash maps
 * Created by CO21321 on 2/5/2018.
 */
public class WeakHashMapPracticeHarness {

    public static void main(String[] args) throws InterruptedException {
        //First let's run the code using a HashMap
        Map<WeakHashMapEmployee, String> weakHashMapDemo1=new HashMap<>();

        WeakHashMapEmployee employee1= new WeakHashMapEmployee("Kingshuk","Programmer",45895.00);

        WeakHashMapEmployee employee2= new WeakHashMapEmployee("Deeksha","Architect",45789.00);

        weakHashMapDemo1.put(employee1,employee1.getName());

        weakHashMapDemo1.put(employee2,employee2.getName());

        System.out.println("Output using hash map\n________________________________________________\n");

        System.out.println(weakHashMapDemo1);

        employee1=null;

        employee2=null;

        System.gc();
        Thread.sleep(5000);

        System.out.println(weakHashMapDemo1);

        //_______________________________________________________________________________________________________________

        //Now let's do the same thing with WeakHashMap

        Map<WeakHashMapEmployee, String> weakHashMapDemo2=new WeakHashMap<>();

        /*String employeeId="4578956";

        weakHashMapDemo.put("232649","Kingshuk");
        weakHashMapDemo.put(employeeId, "Deeksha");*/

        /**
         * The output is as shown below
         *
         * {WeakHashMapEmployee{name='Kingshuk', designation='Programmer', salary=45895.0}=Kingshuk,
         * WeakHashMapEmployee{name='Deeksha', designation='Architect', salary=45789.0}=Deeksha}
         * Finalize was called
         * Finalize was called
         * {}
         *
         * The reason for this is as described below,
         *
         * For a HashMap the objects referenced by employee3 and employee4 are still being referenced from the Map
         * So they don't get garbage collected (They're not weak references, they're strong references)
         *
         * For a weak HashMap, the objects being referenced by employee3 and employee4 are garbage collected, even though
         * they're effectively being referenced by the map
         *
         * Elements in a weak HashMap can be reclaimed by the garbage collector if there are no other strong references to the key object,
         * this makes them useful for caches/lookup storage. This is the essence.
         */

        WeakHashMapEmployee employee3= new WeakHashMapEmployee("Kingshuk","Programmer",45895.00);

        WeakHashMapEmployee employee4= new WeakHashMapEmployee("Deeksha","Architect",45789.00);

        weakHashMapDemo2.put(employee3,employee3.getName());

        weakHashMapDemo2.put(employee4,employee4.getName());

        System.out.println("\nOutput using weak hash map\n________________________________________________\n");

        System.out.println(weakHashMapDemo2);

        employee3=null;

        employee4=null;

        System.gc();
        Thread.sleep(5000);

        System.out.println(weakHashMapDemo2);

        /**
         * The below part of the code does NOT work. Will have to analyze why
         */

        /*Map<String, WeakHashMapEmployee> weakHashMapDemo=new WeakHashMap<>();

        String employeeId="4578956";

        weakHashMapDemo.put("232649","Kingshuk");
        weakHashMapDemo.put(employeeId, "Deeksha");

        WeakHashMapEmployee employee1= new WeakHashMapEmployee("Kingshuk","Programmer",45895.00);

        WeakHashMapEmployee employee2= new WeakHashMapEmployee("Deeksha","Architect",45789.00);

        weakHashMapDemo.put(employee1.getName(),employee1);

        weakHashMapDemo.put(employee2.getName(),employee2);

        System.out.println(weakHashMapDemo);

        employee1=null;

        employee2=null;

        System.gc();
        Thread.sleep(5000);

        System.out.println(weakHashMapDemo);
        */
    }
}
