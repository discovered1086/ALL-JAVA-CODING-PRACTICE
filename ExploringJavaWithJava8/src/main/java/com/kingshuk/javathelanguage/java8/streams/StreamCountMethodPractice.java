package com.kingshuk.javathelanguage.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamCountMethodPractice {

	public static void main(String[] args) {
		List<String> actorNames = Arrays.asList("Leonardo DiCaprio",
				"Brad Pitt", "Bradley Cooper", "Sylvester Stallone",
				"Al Pacino");
		
		System.out.println("Number of actors in my list: "
				+actorNames.stream().count());
	}

}
