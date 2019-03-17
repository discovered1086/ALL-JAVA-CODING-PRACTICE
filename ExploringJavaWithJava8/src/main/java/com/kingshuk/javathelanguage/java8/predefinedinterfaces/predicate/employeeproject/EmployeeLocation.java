package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.employeeproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public enum EmployeeLocation {
	BANGALORE("223 Ramaswamy Road", "Plot B1", "Bangalore", "Karnataka", "768599", "LOCIND001"),
	CHENNAI("34 Pallikaranai Road", "Sector II", "Chennai", "TamilNadu", "600458", "LOCIND002"),
	KOLKATA("Plot 34/B", "Salt Lake Sector V", "Kolkata", "West Bengal", "700001", "LOCIND003"),
	CHICAGO("2500 Lake Cook Rd", "", "Riverwoods", "Illinois", "60015", "LOCUS001");

	String addressLine1;

	String addressLine2;

	String city;

	String state;

	String zipCode;

	String locationCode;

}
