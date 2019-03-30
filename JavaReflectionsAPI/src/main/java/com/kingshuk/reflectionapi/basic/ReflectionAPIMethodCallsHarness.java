package com.kingshuk.reflectionapi.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * A class to practice the reflection API Created by CO21321 on 2/22/2018.
 */
public class ReflectionAPIMethodCallsHarness {

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

			Object reflectionEmployeeObject = constructor.newInstance(null);

			System.out.println("\n____________________OBJECT CREATION USING DEFAULT CONSTRUCTOR_________________________________________\n");
			
			System.out.println("The hash code of the object is "+reflectionEmployeeObject);


			System.out.println("\n_____________________SETTER METHOD INVOCATION ON CREATED OBJECT________________________________________\n");

			//System.out.println("The name of the person is "+reflectionEmployeeObject2.getName());

			/**
			 * setting values in the object through setter methods using the reflection API
			 */
			Method setNameMethod = theClass.getMethod("setName", String.class);

			setNameMethod.invoke(reflectionEmployeeObject,"Kingshuk");

			Method setSalaryMethod = theClass.getMethod("setSalary", double.class);

			setSalaryMethod.invoke(reflectionEmployeeObject, 654564.00);

			Method setDesignationMethod = theClass.getMethod("setDesignation", String.class);

			setDesignationMethod.invoke(reflectionEmployeeObject, "Programmer");


			System.out.println("The name of the person (Using reflection method call) is "+ theClass.getMethod("getName",null).invoke(reflectionEmployeeObject,null));

			System.out.println("\nThe salary of the person (Using reflection method call) is "+ theClass.getMethod("getSalary",null).invoke(reflectionEmployeeObject,null));

			System.out.println("\nThe destination of the person (Using reflection method call) is "+ theClass.getMethod("getDesignation",null).invoke(reflectionEmployeeObject,null));

			
		} catch (ClassNotFoundException | NoSuchMethodException | 
					SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			e.printStackTrace();
		}
	}
}
