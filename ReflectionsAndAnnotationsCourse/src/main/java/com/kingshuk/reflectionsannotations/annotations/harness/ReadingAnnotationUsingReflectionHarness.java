package com.kingshuk.reflectionsannotations.annotations.harness;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.kingshuk.reflectionsannotations.annotations.customannotations.Aggregate;
import com.kingshuk.reflectionsannotations.annotations.model.PassengerCar;

public class ReadingAnnotationUsingReflectionHarness {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
			IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		Class<?> clazz = Class.forName("com.kingshuk.reflectionsannotations.annotations.PassengerCar");

		PassengerCar passengerCar = (PassengerCar) clazz.getConstructor().newInstance();

		// Field[] fields = clazz.getDeclaredFields();

		Field[] fields = passengerCar.getClass().getDeclaredFields();

		for (Field field : fields) {

			if (field.isAnnotationPresent(Aggregate.class)) {
				Aggregate declaredAnnotation = field.getAnnotation(Aggregate.class);

				System.out.println(declaredAnnotation.name());
			}
		}
	}

}
