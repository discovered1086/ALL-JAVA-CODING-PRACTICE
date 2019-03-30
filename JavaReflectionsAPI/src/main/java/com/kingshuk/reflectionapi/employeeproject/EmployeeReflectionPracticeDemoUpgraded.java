package com.kingshuk.reflectionapi.employeeproject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.util.ReflectionUtils;

public class EmployeeReflectionPracticeDemoUpgraded {

	public static void main(String[] args) {
		Employee employee = new Employee("Kingshuk", new Address("ADD", "Buffalo Grove", "IL"),
				new Designation("Developer", "Developer", "DES"));

		Method[] declaredMethods = employee.getClass().getDeclaredMethods();

		for (Method method : declaredMethods) {
			if (method.getReturnType().isAnnotationPresent(InfoIncluded.class)) {

				Class<?> returnType = method.getReturnType();

				Method declatedMethod = ReflectionUtils.findMethod(returnType, "getInfoId");

				if (declatedMethod != null) {
					try {
						Object object = method.invoke(employee);

						String returnString = (String) declatedMethod.invoke(object);

						System.out.println(returnString);
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						e.printStackTrace();
					}
				}
			}
		}

	}

}
