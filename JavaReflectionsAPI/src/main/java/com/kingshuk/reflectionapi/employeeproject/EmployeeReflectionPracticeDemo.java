package com.kingshuk.reflectionapi.employeeproject;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class EmployeeReflectionPracticeDemo {

	public static void main(String[] args) {
		Employee employee = new Employee("Kingshuk", 
						new Address("ADD", "Buffalo Grove", "IL"), 
						new Designation("Developer", "Developer", "DES"));
		
		Field [] fields = employee.getClass().getDeclaredFields();
		
		for (Field field : fields) {
			Class<?> type = field.getType();
			
			InfoIncluded annotationIncluded = type.getAnnotation(InfoIncluded.class);
			
			if(annotationIncluded!=null) {
				try {
					Method declaredMethod = field.getType().getDeclaredMethod("getInfoId");
					
					String returnValue = (String) declaredMethod.invoke(employee.getAddress());
					
					System.out.println(returnValue);
				} catch (NoSuchMethodException | SecurityException 
						| IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
