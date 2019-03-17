package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employee {

	private String employeeName;

	private EmployeeLocation employeeLocation;

	private Designation designation;

	private double salary;

	private Employee(String employeeName, EmployeeLocation employeeLocation, Designation designation, double salary) {
		super();
		this.employeeName = employeeName;
		this.employeeLocation = employeeLocation;
		this.designation = designation;
		this.salary = salary;
	}

	private Employee() {
		super();
	}

	// Factory pattern using inner class
	public static class FactoryMethodCreator {

		public Employee createEmployee(String employeeName, EmployeeLocation employeeLocation, Designation designation,
				double salary) {

			// Predicate<Double> checkSalary = s -> s >= designation.minimumSalary;

			DoublePredicate checkSalary = s -> s >= designation.minimumSalary;

			BiPredicate<EmployeeLocation, Designation> checkDesignationAndLocation = (loc,
					des) -> loc.equals(EmployeeLocation.BANGALORE) && des.equals(Designation.DEVELOPER);
					
			String message = "";

			if(checkSalary.negate().test(salary) ||
					checkDesignationAndLocation.test(employeeLocation, designation)) {
				if (checkSalary.negate().test(salary)) {
					message = "Employee Salary must be greater than designation minimum";
				}
				
				if(checkDesignationAndLocation.test(employeeLocation, designation)) {
					message = message.concat(" "+ designation.designationName+" can't work from "+
								employeeLocation.city);
				}
				
				throw new EmployeeCreationException(message);
			}

			return new Employee(employeeName, employeeLocation, designation, salary);

		}
	}

	public static FactoryMethodCreator createInnerClass() {
		return new FactoryMethodCreator();
	}

}
