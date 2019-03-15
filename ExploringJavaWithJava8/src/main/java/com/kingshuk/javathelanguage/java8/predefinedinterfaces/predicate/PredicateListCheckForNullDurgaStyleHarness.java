package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateListCheckForNullDurgaStyleHarness {

	public static void main(String[] args) {
		Predicate<String> nullAndEmptyCheckPredicate =  s -> s!=null && s.length()>0;
		
		List<String> stringList = Arrays.asList("Kingshuk","Deeksha","Rohan","Amit",null, "","Mayuri","",null);
		
		System.out.println("List before filtering: \n"+stringList);
		
		List<String> collectedStrings = stringList.stream().
				filter(nullAndEmptyCheckPredicate).collect(Collectors.toList());
		
		
		System.out.println("List after filtering: \n"+collectedStrings);
		
	}

}
