package mypractice.reflectionapi.basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**
 * A class to practice accessing annotations
 * Created by CO21321 on 2/23/2018.
 */
public class ReflectionAPIAccessAnnotationHarness {
    public static void main(String[] args) {

        try {
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
            Class<?> theClass = Class.forName(Manager.class.getName());


            /**
             * Object creation using default constructor
             * _________________________________________________________________________
             * The below code gives us the default constructor as we have passed null as the argument
             */
            Constructor<?> constructor = theClass.getConstructor(null);

            Object newInstance = constructor.newInstance(null);

            System.out.println("\n____________________OBJECT CREATION USING DEFAULT CONSTRUCTOR_________________________________________\n");

            System.out.println("The hash code of the object is " + newInstance);

            /**
             * Now we need to get the annotations on different levels
             */

            System.out.println("\n____________________ANNOTATIONS_________________________________________\n");

            Annotation[] annotations = theClass.getAnnotations();

            System.out.println("The annotations are "+ Arrays.toString(annotations));

            System.out.println("\n____________________THE VALUE OF THE ANNOTATIONS_________________________________________\n");

            //Annotation annotation = annotations[0];

            // We have to type case it otherwise it won't give us our specific annotation values

            ReflectionAPITestAnnotation annotation= (ReflectionAPITestAnnotation)annotations[0];

            //Now we're going to print the values of the annotations.

            System.out.println("The annotation value is "+annotation.managerId());

            /**
             * ******************************IMPORTANT************************************************
             * Accessing and using annotations using the reflection API is really really important as this is how
             * All frameworks like spring, junit, servlet api get the details of what we declare and use them to
             * construct objects, call methods etc.
             * *****************************************************************************************
             */


        } catch (ClassNotFoundException | InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
