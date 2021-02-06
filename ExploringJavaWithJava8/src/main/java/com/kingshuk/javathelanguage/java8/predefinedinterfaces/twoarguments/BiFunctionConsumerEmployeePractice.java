package com.kingshuk.javathelanguage.java8.predefinedinterfaces.twoarguments;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class BiFunctionConsumerEmployeePractice {

	public static void main(String[] args) {
		BiFunction<Employee, Ratings, Double> calculateSalary = (employee, rating) -> {
			double currentSalary = employee.salary;

			Float increment = IncrementRateByDesignation.getIncrement(employee.getRole(), rating);

			return currentSalary + ((currentSalary * increment)/100);
		};

		BiConsumer<Employee, Ratings> incrementCalculator = (employee, rating) -> {
			employee.salary = calculateSalary.apply(employee, rating);

			System.out.println(employee.name + "'s new salary is: " + employee.salary);
		};

		incrementCalculator.accept(new Employee("Kingshuk Mukherjee", 30000, EmployeeRole.DEVELOPER),
				Ratings.SECOND_BUCKET);
		incrementCalculator.accept(new Employee("Deeksha Banerjee", 50000, EmployeeRole.MANAGER), Ratings.FIRST_BUCKET);
	}

	@Getter
	@AllArgsConstructor
	static class Employee {
		private String name;

		private double salary;

		private EmployeeRole role;
	}

	enum EmployeeRole {
		MANAGER, DEVELOPER;
	}

	enum Ratings {
		FIRST_BUCKET, SECOND_BUCKET, THIRD_BUCKET, FOURTH_BUCKET;
	}

	@AllArgsConstructor
	@Getter
	enum IncrementRateByDesignation {

		MANAGER_FIRST_BUCKET(EmployeeRole.MANAGER, Ratings.FIRST_BUCKET, 30.0f),
		MANAGER_SECOND_BUCKET(EmployeeRole.MANAGER, Ratings.SECOND_BUCKET, 20.0f),
		MANAGER_THIRD_BUCKET(EmployeeRole.MANAGER, Ratings.THIRD_BUCKET, 5.0f),
		MANAGER_FOURTH_BUCKET(EmployeeRole.MANAGER, Ratings.FOURTH_BUCKET, 0.1f),
		DEVELOPER_FIRST_BUCKET(EmployeeRole.DEVELOPER, Ratings.FIRST_BUCKET, 40.0f),
		DEVELOPER_SECOND_BUCKET(EmployeeRole.DEVELOPER, Ratings.SECOND_BUCKET, 30.0f),
		DEVELOPER_THIRD_BUCKET(EmployeeRole.DEVELOPER, Ratings.THIRD_BUCKET, 20.0f),
		DEVELOPER_FOURTH_BUCKET(EmployeeRole.DEVELOPER, Ratings.FOURTH_BUCKET, 10.0f);

		private EmployeeRole employeeRole;
		private Ratings rating;
		private float percentageIncrement;

		public static float getIncrement(EmployeeRole role, Ratings rating) {
			IncrementRateByDesignation[] values = IncrementRateByDesignation.values();

			for (IncrementRateByDesignation incrementRateByDesignation : values) {
				if (role.equals(incrementRateByDesignation.getEmployeeRole())
						&& rating.equals(incrementRateByDesignation.rating)) {
					return incrementRateByDesignation.percentageIncrement;
				}
			}

			return 0.0f;
		}

	}

}
