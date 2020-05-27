package com.kingshuk.reflectionsannotations;

import java.lang.reflect.Constructor;

class PrivateConstructorClass {

	PrivateConstructorClass() {
		System.out.println("Class object created");
	}
}

public class ReflectionQuickDemo {

	public static void main(String[] args) throws Exception{
		// PrivateConstructorClass className = new PrivateConstructorClass();
		Class<?> class1 = Class.forName("com.kingshuk.reflectionsannotations.PrivateConstructorClass");
		Constructor<?> constructor = class1.getDeclaredConstructor();

		constructor.setAccessible(true);

		constructor.newInstance();
	}

}
