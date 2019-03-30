package com.kingshuk.reflectionapi.employeeproject;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@InfoIncluded
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	public String getInfoId() {
		return infoId;
	}
	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	private String infoId;
	private String city;
	private String state;
	
	
}
