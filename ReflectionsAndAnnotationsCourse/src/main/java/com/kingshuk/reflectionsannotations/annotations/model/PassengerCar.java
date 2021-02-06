package com.kingshuk.reflectionsannotations.annotations.model;

import com.kingshuk.reflectionsannotations.annotations.customannotations.Aggregate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PassengerCar{
	
	@Aggregate(name = "passengerCar")
	private String vehicleCategory;

}