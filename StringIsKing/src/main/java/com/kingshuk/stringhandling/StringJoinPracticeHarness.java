package com.kingshuk.stringhandling;

import java.util.Arrays;
import java.util.List;

public class StringJoinPracticeHarness {

	public static void main(String[] args) {
		List<String> entries = Arrays.asList("Your new review is a great addition to Google.",
				"Millions of people rely on reviews like yours to decide where to go.",
				"You received this email to confirm that the user content that you contributed to "
				+ "Google was published.");
		
		
		System.out.println("**************************************************\n");
		
		System.out.println(String.join(System.lineSeparator(), entries));
		
		System.out.println("\n\n**************************************************\n\n");
	}

}
