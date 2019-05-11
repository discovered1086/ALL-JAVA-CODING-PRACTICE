package com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer;

import java.util.Arrays;
import java.util.function.Consumer;

import com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer.pojos.Actor;
import com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer.pojos.Movie;

public class ConsumerChainingPracticeHarness {

	public static void main(String[] args) {
		Movie movie = new Movie();
		
		Consumer<Movie> basicMovieCreator = movie1 ->{
			movie.setMovieId(123);
			movie.setMovieLanguage("English");
			movie.setMovieName("A walk to remember");
		};
		
		Consumer<Movie> basicActorCreator = movie2 ->{
			Actor actor = Actor.builder().name("Sylvester Stallone")
										 .bioLink("https://www.google.com")
										 .build();
			
			Actor actor2 = Actor.builder().name("Sandra Bullock")
					 .bioLink("https://www.google.com")
					 .build();
			
			movie.setActors(Arrays.asList(actor, actor2));
		};
		
		//Imagine some complex logic is there to calculate the ratings
		Consumer<Movie> ratingsConsumer = movie3-> movie3.setMovieRatings(4.5f);
		
		Consumer<Movie> printerConsumer = System.out::println;
		
		//Now let's do the work
		Consumer<Movie> finalConsumer = basicMovieCreator.andThen(basicActorCreator)
														 .andThen(ratingsConsumer)
														 .andThen(printerConsumer);
		
		finalConsumer.accept(movie);
	}

}
