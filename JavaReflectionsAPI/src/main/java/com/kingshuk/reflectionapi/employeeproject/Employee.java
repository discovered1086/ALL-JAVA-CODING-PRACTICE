package com.kingshuk.reflectionapi.employeeproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
	private String name;
	
	private Address address;
	
	private Designation designation;
}
