package com.kingshuk.javathelanguage.java8.predefinedinterfaces.supplier;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierPractice {

	public static void main(String[] args) {
		Supplier<LocalDateTime> currentDate = LocalDateTime::now;
		
		System.out.println(currentDate.get());
	}

}
