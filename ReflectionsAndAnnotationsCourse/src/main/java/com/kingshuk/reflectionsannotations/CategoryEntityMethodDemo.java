package com.kingshuk.reflectionsannotations;

import java.lang.reflect.Method;

import com.kingshuk.reflectionsannotations.model.CategoryEntity;

public class CategoryEntityMethodDemo {

	public static void main(String[] args) throws Exception {
		CategoryEntity categoryEntity = CategoryEntity.builder().categoryId("CTGRY1")
				.categoryName("Grocery")
				.active(40)
				.build();

		Class<? extends CategoryEntity> class1 = categoryEntity.getClass();

		System.out.println("All non-declared methods \n");

		Method[] methods = class1.getMethods();

		for (Method method : methods) {
			System.out.println(method.getName());
		}

		System.out.println("============================================ \n");
		System.out.println("All declared methods \n");

		Method[] declaredMethods = class1.getDeclaredMethods();

		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		
		System.out.println("============================================ \n");
		
		Method method = class1.getMethod("setActive", int.class);
		method.invoke(categoryEntity, 50);
		
		Method method2 = class1.getMethod("getActive");
		
		System.out.println("The value of the active field is: "+method2.invoke(categoryEntity));
		
	}

}
