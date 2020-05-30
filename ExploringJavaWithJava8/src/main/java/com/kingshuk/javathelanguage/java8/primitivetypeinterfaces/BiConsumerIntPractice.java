package com.kingshuk.javathelanguage.java8.primitivetypeinterfaces;

import java.util.function.ObjIntConsumer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

public class BiConsumerIntPractice {

	public static void main(String[] args) {
		//BiConsumer<Employee, Integer> incrementSalary = (emp, incr) -> emp.salary = emp.salary + incr;
		
		ObjIntConsumer<Employee> incrementSalary = (emp, incr) -> emp.salary = emp.salary + incr;
		
		BiConsumerIntPractice practice = new BiConsumerIntPractice();
		
		Employee employee = practice.new Employee("Kingshuk Mukherjee", 30000);

		incrementSalary.accept(employee, 5000);
		
		System.out.println("Current salary of the employee is: "+employee.getSalary());
	}

	@Getter
	@Setter
	@AllArgsConstructor
	private class Employee {
		private String name;
		private int salary;
	}

}
