package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject.Designation;
import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject.Employee;
import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject.EmployeeLocation;

public class EmployeeSalaryIncrementDemo {

	public static void main(String[] args) {
		Employee employee1 = Employee.createInnerClass().createEmployee("Kingshuk Mukherjee", EmployeeLocation.CHENNAI,
				Designation.DEVELOPER, 68000.00, "03/29/2010");
		Employee employee2 = Employee.createInnerClass().createEmployee("Deeksha Banerjee", EmployeeLocation.CHICAGO,
				Designation.MANAGER, 110000.00, "04/28/2010");
		Employee employee3 = Employee.createInnerClass().createEmployee("Amit Biswas", EmployeeLocation.CHENNAI,
				Designation.MANAGER, 120000.00, "03/19/2010");
		Employee employee4 = Employee.createInnerClass().createEmployee("Mayuri Srivastava", EmployeeLocation.KOLKATA,
				Designation.DEVELOPER, 75000.00, "03/29/2012");
		Employee employee5 = Employee.createInnerClass().createEmployee("Mainak Biswas", EmployeeLocation.BANGALORE,
				Designation.TESTER, 65000.00, "03/29/2018");
		
		List<Employee> employeeList = Arrays.asList(employee1, employee2, employee3, employee4, employee5);
		
		/*Function<List<Employee>, Double> getTotalSalary = employees -> {
			Double totalSalary = 0.00;
			
			for (Employee employee : employeeList) {
				totalSalary+=employee.getSalary();
			}
			
			return totalSalary;
		};*/
		
		ToDoubleFunction<List<Employee>> getTotalSalary = employees -> {
			Double totalSalary = 0.00;
			
			for (Employee employee : employeeList) {
				totalSalary+=employee.getSalary();
			}
			
			return totalSalary;
		};
		
		System.out.println("Total salary of employees is: "+
		Math.round(getTotalSalary.applyAsDouble(employeeList)));
	}

}
