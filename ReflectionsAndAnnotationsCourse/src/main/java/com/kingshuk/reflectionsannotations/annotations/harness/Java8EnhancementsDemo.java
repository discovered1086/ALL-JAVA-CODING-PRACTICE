package com.kingshuk.reflectionsannotations.annotations.harness;

import com.kingshuk.reflectionsannotations.annotations.customannotations.AggregateLocalVariable;
import com.kingshuk.reflectionsannotations.annotations.customannotations.AggregateMethodParameter;
import com.kingshuk.reflectionsannotations.annotations.customannotations.AggregateTypeUse;
import com.kingshuk.reflectionsannotations.annotations.customannotations.VehicleType;
import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Java8EnhancementsDemo<@VehicleType T> {

	private final T theCar;

	private @AggregateTypeUse String name;

	public static void main(String[] args) {
		@AggregateLocalVariable String name = "Kingshuk Mukherjee";
		@AggregateTypeUse String name1 = "Deeksha Banerjee";
		List<@AggregateTypeUse String> names= new ArrayList<>();
		names.add(name);
		names.add(name1);
		print(names);
	}

	private static void print(@AggregateMethodParameter @AggregateTypeUse
									  List<@AggregateTypeUse String> names){
		names.forEach(name -> System.out.printf("The name is: %s%n", name));
	}

}
