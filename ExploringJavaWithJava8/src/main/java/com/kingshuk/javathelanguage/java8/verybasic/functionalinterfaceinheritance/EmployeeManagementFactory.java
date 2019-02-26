package com.kingshuk.javathelanguage.java8.verybasic.functionalinterfaceinheritance;

import com.kingshuk.java8.verybasic.Employee;

@FunctionalInterface
public interface EmployeeManagementFactory {
	
	Employee getEmployeeObject(int employeeId, String employeeName);
	

}
