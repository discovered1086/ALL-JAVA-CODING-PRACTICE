package com.kingshuk.reflectionsannotations;

public class GettingClassInformationDemo {

	@SuppressWarnings({ "unused", "squid:S1854", "squid:S1481", "squid:S2133" })
	public static void main(String[] args) throws Exception {
		// Using forName method
		Class<?> class1 = Class.forName("java.lang.String");
		Class<?> class2 = Class.forName("java.lang.String");

		System.out.println("Do these two references point to the same class? " 
		+ ((class1 == class2) ? "Yes" : "No"));

		// Using the .class keyword
		Class<String> stringClass = String.class;
		Class<?> intClass = int.class;

		// Using the getClass() method
		PrivateConstructorClass constructorClass = new PrivateConstructorClass();
		Class<? extends PrivateConstructorClass> constructorClass2 = constructorClass.getClass();
		
		//Getting the super class
		Class<?> superclass = constructorClass2.getSuperclass();
		
		//Get interfaces
		Class<?>[] interfaces = constructorClass2.getInterfaces();
		
		System.out.println("===============================\n"+superclass.getName());
		
		System.out.println(interfaces.length);
		
		//Getting name of the class
		String name = constructorClass2.getName();
		System.out.println(name);
	}

}
