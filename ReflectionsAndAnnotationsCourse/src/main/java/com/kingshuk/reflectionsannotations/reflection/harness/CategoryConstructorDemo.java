package com.kingshuk.reflectionsannotations.reflection.harness;

import java.lang.reflect.Constructor;

import com.kingshuk.reflectionsannotations.reflection.model.CategoryEntity;

public class CategoryConstructorDemo {

	public static void main(String[] args) throws Exception {
		Class<?> class1 = Class.forName("com.kingshuk.reflectionsannotations.model.CategoryEntity");

		Constructor<?>[] constructors = class1.getConstructors();

		for (Constructor<?> constructor : constructors) {
			System.out.println(constructor);
		}
		
		System.out.println("============================================ \n");

		Constructor<?>[] declaredConstructors = class1.getDeclaredConstructors();

		for (Constructor<?> constructor : declaredConstructors) {
			System.out.println(constructor);
		}
		
		System.out.println("==================Using public constructor========================== \n");
		
		Constructor<?> constructor = class1.getConstructor(String.class, String.class, int.class);
		CategoryEntity category = (CategoryEntity) constructor.newInstance("CTGRY2", "Rent Payment", 90);
		
		System.out.println(category);
		
		System.out.println("==================Using private constructor========================== \n");
		
		Constructor<?> declaredConstructor = class1.getDeclaredConstructor();
		declaredConstructor.setAccessible(true);
		CategoryEntity category2 = (CategoryEntity) declaredConstructor.newInstance();
		
		System.out.println(category2);
	}

}
