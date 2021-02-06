package com.kingshuk.reflectionsannotations.harness;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import com.kingshuk.reflectionsannotations.model.CategoryEntity;

public class CategoryEntityModifierDemo {

	public static void main(String[] args) throws Exception {
		CategoryEntity categoryEntity = CategoryEntity.builder().categoryId("CTGRY1").categoryName("Grocery").build();

		Class<? extends CategoryEntity> class1 = categoryEntity.getClass();

		int modifiers = class1.getModifiers();

		System.out.println(modifiers);

		int returnValue = modifiers & Modifier.PUBLIC;

		System.out.println(returnValue);

		System.out.println("Is the class public? " + Modifier.isPublic(modifiers));

		System.out.println(Modifier.toString(modifiers));

		Class<?> class2 = CategoryEntityModifierDemo.class;

		Method method = class2.getMethod("main", String[].class);

		System.out.println(Modifier.toString(method.getModifiers()));
	}

}
