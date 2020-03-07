package com.kingshuk.javathelanguage.java8.optional.beans;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
	
	private String addressLine1;
	private String addressLine2;
	private String city;

}
