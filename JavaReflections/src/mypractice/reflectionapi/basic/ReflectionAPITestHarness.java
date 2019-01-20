package mypractice.reflectionapi.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * A class to practice the reflection API Created by CO21321 on 2/20/2018.
 */
public class ReflectionAPITestHarness {

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
			System.out.println("The class name is " + theClass);
			System.out.println("\n_____________________________________________________________\n");

			Constructor<?>[] constructors = theClass.getConstructors();

			/*
			 * for (Constructor<?> constructor : constructors) {
			 * System.out.println(constructor.toString()); }
			 */
			System.out.println("The constructors are " + Arrays.toString(constructors));

			Field[] fields = theClass.getFields();
			
			/**
			 * The fields don't get printed here, reason for that being by default, the private members of a class can't be accessed.
			 * BY DEFAULT I SAID.
			 */
			System.out.println("The fields of the class are "+Arrays.toString(fields));
			
			/**
			 * But the methods are public so we can easily do that
			 */
			Method[] methods = theClass.getMethods();
			
			System.out.println("The methods are "+Arrays.toString(methods));
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
