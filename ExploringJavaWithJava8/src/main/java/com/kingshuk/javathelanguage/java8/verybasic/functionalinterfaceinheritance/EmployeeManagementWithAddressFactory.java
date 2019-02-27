package com.kingshuk.javathelanguage.java8.verybasic.functionalinterfaceinheritance;

import com.kingshuk.javathelanguage.java8.verybasic.Address;
import com.kingshuk.javathelanguage.java8.verybasic.Employee;

@FunctionalInterface
public interface EmployeeManagementWithAddressFactory 
extends EmployeeManagementFactory {
	
	Employee getEmployeeObject(int employeeId, String employeeName);
	
	static Employee getEmployeeWithAddress(int employeeId, 
			String employeeName, String city, String state, String zipCode) {
		Employee employee = new Employee(employeeId, employeeName);
		
		Address address = new Address(city, state, zipCode);
		
		employee.setAddress(address);
		
		return employee;
	}

}
