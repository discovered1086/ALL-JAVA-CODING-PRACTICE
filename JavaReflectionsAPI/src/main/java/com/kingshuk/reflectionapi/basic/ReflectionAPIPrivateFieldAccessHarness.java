package com.kingshuk.reflectionapi.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * A class to practice the reflection API Created by CO21321 on 2/22/2018.
 */
public class ReflectionAPIPrivateFieldAccessHarness {

	public static void main(String[] args) {
		// The first task is to load the class in memory
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
			Class<?> theClass = Class.forName(EmployeeForReflection.class.getName());

			/**
			 * Object creation using default constructor
			 * _________________________________________________________________________
			 * The below code gives us the default constructor as we have passed null as the argument
			 */
			Constructor<?> constructor = theClass.getConstructor(null);

            Object newInstance = constructor.newInstance(null);

            System.out.println("\n____________________POPULATING PRIVATE FIELDS AND PRINTING_________________________________________\n");
			
			System.out.println("The hash code of the object is "+newInstance);

			/**
			 * Now we'll try to access the private fields and set their value directly
			 */
            Field declaredField = theClass.getDeclaredField("name");
            declaredField.setAccessible(true);

            Field declaredField2 = theClass.getDeclaredField("salary");
            declaredField2.setAccessible(true);

            Field declaredField3 = theClass.getDeclaredField("designation");
            declaredField3.setAccessible(true);

            /**
             * Now we'll be setting the value to the field
             */
            declaredField.set(newInstance, "Kingshuk");
            declaredField2.set(newInstance, 65664.23);
            declaredField3.set(newInstance, "Tech Lead");

            System.out.println("The employees name is "+theClass.getMethod("getName",null).invoke(newInstance,null)
            + ". He earns around $"+theClass.getMethod("getSalary",null).invoke(newInstance,null)
            + " and he's a "+theClass.getMethod("getDesignation",null).invoke(newInstance,null));


        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchFieldException e) {
			e.printStackTrace();
		}
    }
}
