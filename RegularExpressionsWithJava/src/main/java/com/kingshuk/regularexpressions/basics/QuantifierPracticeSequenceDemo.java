package com.kingshuk.regularexpressions.basics;

import java.util.Objects;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierPracticeSequenceDemo {

	public static void main(String[] args) {
		String regularExpression ="^SBCTGRY+([0-9]{1,8}$)";

		Pattern pattern = Pattern.compile(regularExpression);

		Matcher matcher = pattern.matcher("SBCTGRY123456");
		
		System.out.println(matcher.matches());
		
		String CATEGORY_ID_VALIDATION = "^CTGRY+([0-9]{1,10}$)";
		//String SB_CATEGORY_ID_VALIDATION = "^SBCTGRY+([0-9]{1,8}$)";

		final Predicate<String> categoryIdCheck = categoryId -> Objects.nonNull(categoryId)
				&& Pattern.compile(CATEGORY_ID_VALIDATION).matcher(categoryId).matches();
		
		System.out.println(categoryIdCheck.test("JSHDFSDGFG1654654"));
	}

}
