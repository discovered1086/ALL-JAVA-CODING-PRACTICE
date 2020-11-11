package com.kingshuk.reflectionsannotations.annotations.model;

import com.kingshuk.reflectionsannotations.annotations.customannotations.Aggregate;
import com.kingshuk.reflectionsannotations.annotations.customannotations.VehicleType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Aggregate(name = "VehicleAggregate")
public class Vehicle<@VehicleType T> {
	
	private @Aggregate String registrationNo;
	
	private String vehicleCategory;
	
	private T make;

}
