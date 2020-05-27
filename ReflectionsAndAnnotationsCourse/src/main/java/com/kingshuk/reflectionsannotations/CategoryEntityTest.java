package com.kingshuk.reflectionsannotations;

import java.lang.reflect.Field;

import com.kingshuk.reflectionsannotations.model.CategoryEntity;

public class CategoryEntityTest {

	public static void main(String[] args) {
		CategoryEntity categoryEntity = CategoryEntity.builder().categoryId("CTGRY1").categoryName("Grocery").build();

		Class<? extends CategoryEntity> class1 = categoryEntity.getClass();

		Field[] fields = class1.getFields();

		System.out.println("\nAll public fields of this class are: \n");

		for (Field field : fields) {
			System.out.println(field.getName());
		}

		Field[] declaredFields = class1.getDeclaredFields();

		System.out.println("\nAll fields of this class are: \n");
		for (Field field : declaredFields) {
			System.out.println(field.getName());
		}
	}

}
