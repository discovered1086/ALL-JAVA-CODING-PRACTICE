package mypractice.collectionsandgenerics.mappractice;

import mypractice.collectionsandgenerics.utility.CommonMapGenerator;

import java.util.Map;

/**
 * Hash Map practice
 * Created by CO21321 on 2/2/2018.
 */
public class IdentityHashMapPracticeHarness {

    public static void main(String[] args) {
        /**
         *  There's a lot to talk about the IdentityHashMap. Unlike HashMap and LinkedHashMap, it doesn't check
         *  the uniqueness of the key based on the .equals() check, it checks uniqueness based on == comparison
         *
         *  So the below Map is a LinkedHashMap so the first key of 232649 is same as last two keys based on
         *  the .equals() check even though they're different objects. If we use IdentifyHashMap instead, the first key
         *  and the last two keys are not same, as according to == check, they're different objects, something like
         *
         *  Integer key1=new Integer(232649);
         *  Integer key2=new Integer(232649);
         *  Integer key3=new Integer(232649);
         *
         *  Map<Integer, String> employeeMap = new LinkedHashMap<>();

         employeeMap.put(232649,"Kingshuk");
         employeeMap.put(2545465,"Ramesh");
         employeeMap.put(564564,"Darren");
         employeeMap.put(598785,"Jen");
         employeeMap.put(548587,"Craig");
         employeeMap.put(232649,"Deeksha");
         employeeMap.put(232649,"Reyan");

         * That's why all of the values print and nothing is replaced.
         */
        Map<Integer, String> employeeMap = CommonMapGenerator.getIdentityHashMapOfEmployees();

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
