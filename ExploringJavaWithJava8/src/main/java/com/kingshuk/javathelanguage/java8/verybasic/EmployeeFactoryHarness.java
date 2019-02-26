package com.kingshuk.javathelanguage.java8.verybasic;

public class EmployeeFactoryHarness {

	public static void main(String[] args) {

		EmployeeManagementFactory factory = (employeeId, employeeName) -> {
			Employee employee = new Employee(employeeId, employeeName);

			return employee;
		};

		System.out.println(factory.getEmployeeObject(232649, "Kingshuk Mukherjee"));

		factory = (employeeId, employeeName) -> {
			Employee employee = new Employee(employeeId, employeeName);
			
			Address address = new Address();
			address.setCity("Buffalo Grove");
			address.setState("Illinois");
			address.setZipCode("60089");
			
			employee.setAddress(address);

			return employee;
		};
		
		System.out.println(factory.getEmployeeObject(232649, "Kingshuk Mukherjee"));
		
		System.out.println(EmployeeManagementFactory.getEmployeeWithAddress(232649, 
				"Kingshuk Mukherjee", "Hartford", "Connecticut", "06105"));
	}

}
