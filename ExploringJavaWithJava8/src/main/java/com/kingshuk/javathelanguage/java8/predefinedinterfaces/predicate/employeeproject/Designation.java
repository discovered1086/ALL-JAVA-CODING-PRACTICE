package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString(exclude="minimumSalary")
public enum Designation {
	MANAGER("Manager", "MG", 100000.00),
	DEVELOPER("Developer","DEV", 67000.00),
	TESTER("Tester", "TST",56000.00);
	
	String designationName;
	
	String designtationCode;
	
	double minimumSalary;

	

}
