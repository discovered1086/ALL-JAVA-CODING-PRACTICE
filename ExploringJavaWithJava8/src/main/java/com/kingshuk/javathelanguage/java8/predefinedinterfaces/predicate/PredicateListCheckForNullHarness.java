package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.apache.commons.lang.StringUtils;

public class PredicateListCheckForNullHarness {

	public static void main(String[] args) {
		//Predicate<String> nullAndEmptyCheckPredicate =  s -> s!=null && s.length()>0;
		
		//Predicate<String> nullAndEmptyCheckPredicate =  s -> s!=null && !s.isEmpty();
		
		Predicate<String> nullAndEmptyCheckPredicate2 =  StringUtils::isNotBlank;
		
		//Predicate<String> nullAndEmptyCheckPredicate3 =  s -> StringUtils.isNotEmpty(s);
		
		//Predicate<String> nullAndEmptyCheckPredicate4 =  StringUtils::isNotEmpty;
		
		List<String> stringList = Arrays.asList("Kingshuk","Deeksha","Rohan","Amit",null, "","Mayuri","",null," ");
		
		System.out.println("List before filtering: \n"+stringList);
		
		List<String> collectedStrings = stringList.stream().
				filter(nullAndEmptyCheckPredicate2).collect(Collectors.toList());
		
		
		System.out.println("List after filtering: \n"+collectedStrings);
		
	}

}
