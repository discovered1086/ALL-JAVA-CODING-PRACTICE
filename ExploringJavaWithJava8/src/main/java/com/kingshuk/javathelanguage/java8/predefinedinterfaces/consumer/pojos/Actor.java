package com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer.pojos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Actor {
	private String name;

	private String bioLink;
}
