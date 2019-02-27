package com.kingshuk.javathelanguage.java8.verybasic;



@FunctionalInterface
public interface EmployeeManagementFactory {
	
	Employee getEmployeeObject(int employeeId, String employeeName);
	
	static Employee getEmployeeWithAddress(int employeeId, String employeeName, String city, String state, String zipCode) {
		Employee employee = new Employee(employeeId, employeeName);
		
		Address address = new Address(city, state, zipCode);
		
		employee.setAddress(address);
		
		return employee;
	}

}
