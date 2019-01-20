package mypractice.reflectionapi;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * This class is for Bharath's assignment
 */
public class ReflectionCalculateSumHarness {
    public static void main(String[] args) {
        /**
         * Any class that's loaded in the memory, is represented by "An object of the class called Class"
         *
         * Once we have access to "that object" we can easily access the constructors, methods and fields
         * on the class using that object.
         *
         * So in effect there're 3 very basic but powerful things we can do
         * 1) Get access to the reference of the object that represents the actual class
         * in memory
         *
         * 2) Get access to the constructors, fields, fields etc. using reflection
         *
         * 3) Invoke/use the constructors to instantiate the class
         *
         * 4) Invoke/use the fields and methods using reflection
         */

        try {
            //Step 1: Getting a reference to the object that represents this class in memory
            Class<?> calculatorClass = Class.forName(Calculator.class.getName());

            //Step 2: Get a reference to the constructor object so that we can instantiate this class
            Constructor<?> constructor = calculatorClass.getConstructor(null);

            //Step 3: Instantiate the Calculator class
            Object newInstance = constructor.newInstance(null);

            //Step 4: Now that we have the object, we need to get a reference to the Method object
            Method calculateSum = calculatorClass.getMethod("calculateSum", Integer.class, Integer.class);

            //Step 5: Now that we have the method, we need to actually invoke the method and print the result
            System.out.println("The sum of the two numbers is "+calculateSum.invoke(newInstance, 546377, 8765));

        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
