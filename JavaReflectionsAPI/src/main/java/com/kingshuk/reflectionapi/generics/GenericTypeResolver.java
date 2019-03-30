package com.kingshuk.reflectionapi.generics;

import java.lang.reflect.Method;

public class GenericTypeResolver {
	
	@SuppressWarnings({ "unchecked", "unlikely-arg-type" })
	public <T> void resolveGenerics(String className) {
		
		try {
			Class<T> class1= (Class<T>)Class.forName(className);
			
			T newObject = class1.newInstance();
			
			System.out.println(class1.getSuperclass().equals(Animal.class));
			
			System.out.println(Animal.class.getPackage().getName());
			
			System.out.println(class1.getTypeName());
			
			System.out.println(newObject);
			
			Method[] methods = class1.getMethods();
			
			for (Method method : methods) {
				System.out.println(method.toGenericString());
			}
			
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
