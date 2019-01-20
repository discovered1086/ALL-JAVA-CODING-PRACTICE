package mypractice.jvmarchitecture;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class DynamicClassLoadingHarness {
    public static void main(String[] args) {
        try {
            //The below line of code dynamically loads classes in the method area of the JVM.
            Class<?> ssnHolderClass = Class.forName("mypractice.jvmarchitecture.SSNHolder");

            //Now let's get the method of these classes
            Method[] declaredMethods = ssnHolderClass.getDeclaredMethods();

            Stream<Method> stream= Arrays.stream(declaredMethods);

            stream.forEach((declaredMethods2)-> System.out.println(declaredMethods2.getName()));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
