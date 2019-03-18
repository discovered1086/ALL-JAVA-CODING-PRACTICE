package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.Predicate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
//@Slf4j
public class Employee {

	private String employeeName;

	private EmployeeLocation employeeLocation;

	private Designation designation;

	private double salary;

	private Date joiningDate;

	// Factory pattern using inner class
	public static class FactoryMethodCreator {

		public Employee createEmployee(String employeeName, EmployeeLocation employeeLocation, Designation designation,
				double salary, String date) {

			// Predicate<Double> checkSalary = s -> s >= designation.minimumSalary;

			DoublePredicate checkSalary = s -> s >= designation.minimumSalary;

			BiPredicate<EmployeeLocation, Designation> checkDesignationAndLocation = (loc,
					des) -> loc.equals(EmployeeLocation.BANGALORE) && des.equals(Designation.DEVELOPER);

			SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
			
			Date joiningDate = null;
			try {
				joiningDate = format.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}

			Predicate<Date> datePredicate = datePassed -> datePassed.after(new Date());

			String message = "";

			if (checkSalary.negate().test(salary) || checkDesignationAndLocation.test(employeeLocation, designation)
					|| datePredicate.test(joiningDate)) {
				if (checkSalary.negate().test(salary)) {
					message = String.format("Employee Salary must be greater than designation minimum of %.2f",
							designation.minimumSalary);
				}

				if (checkDesignationAndLocation.test(employeeLocation, designation)) {
					message = message.concat(String.format(" A %s can't work from %s", designation.designationName,
							employeeLocation.city));

				}
				
				if(datePredicate.test(joiningDate)) {
					message = message.concat("Joining date can't be before current date");
				}

				throw new EmployeeCreationException(message);
			}

			return new Employee(employeeName, employeeLocation, designation, salary, joiningDate);

		}
		
	}

	public static FactoryMethodCreator createInnerClass() {
		return new FactoryMethodCreator();
	}

}
