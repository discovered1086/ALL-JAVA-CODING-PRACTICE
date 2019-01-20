package mypractice.reflectionapi.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * A class to practice the reflection API Created by CO21321 on 2/22/2018.
 */
public class ReflectionAPICreateObjectHarness {

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
			
			EmployeeForReflection reflectionEmployeeObject=(EmployeeForReflection) constructor.newInstance(null);

			System.out.println("\n____________________OBJECT CREATION USING DEFAULT CONSTRUCTOR_________________________________________\n");
			
			System.out.println("The hash code of the object is "+reflectionEmployeeObject);

			/**
			 * Object creation using a parametrised constructor that takes a string (name) as argument
			 * _________________________________________________________________________
			 * The below code gives us the parametrised constructor as we have passed a string name as argument
			 */
			Constructor<?> constructor2 = theClass.getConstructor(String.class);

			//EmployeeForReflection reflectionEmployeeObject2=(EmployeeForReflection) constructor2.newInstance("Kingshuk");

			Object reflectionEmployeeObject2 = constructor2.newInstance("Kingshuk");

			System.out.println("\n_____________________OBJECT CREATION USING PARAMETRISED CONSTRUCTORS________________________________________\n");

			System.out.println("The hash code of the object is "+reflectionEmployeeObject);

			System.out.println("\n_____________________METHOD INVOCATION ON CREATED OBJECT________________________________________\n");

			//System.out.println("The name of the person is "+reflectionEmployeeObject2.getName());

			/**
			 * Accessing the same getter method using the reflection API
			 */

			System.out.println("The name of the person (Using reflection method call) is "+ theClass.getMethod("getName",null).invoke(reflectionEmployeeObject2,null));
			
		} catch (ClassNotFoundException | NoSuchMethodException | 
					SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
