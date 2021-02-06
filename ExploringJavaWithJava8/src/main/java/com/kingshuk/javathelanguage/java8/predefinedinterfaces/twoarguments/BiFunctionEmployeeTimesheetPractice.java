package com.kingshuk.javathelanguage.java8.predefinedinterfaces.twoarguments;

import java.util.function.BiFunction;

import lombok.AllArgsConstructor;
import lombok.Data;

public class BiFunctionEmployeeTimesheetPractice {

	@Data
	@AllArgsConstructor
	static class Employee {
		private String employeeId;

		private String employeeName;

		private Double hourlyWage;
	}

	@Data
	@AllArgsConstructor
	static class Timesheet {
		private String employeeId;

		private int numberOfWorkDays;
	}

	public static void main(String[] args) {
		BiFunction<Employee, Timesheet, Double> wageCalculator = (employee, timesheet) -> {
			int hours = timesheet.numberOfWorkDays * 8;

			return employee.hourlyWage * hours;
		};

		System.out.println("Hourly wage of Kingshuk is: $" + wageCalculator
				.apply(new Employee("232649", "Kingshuk Mukherjee", 56.72), new Timesheet("232649", 22)));
	}

}
