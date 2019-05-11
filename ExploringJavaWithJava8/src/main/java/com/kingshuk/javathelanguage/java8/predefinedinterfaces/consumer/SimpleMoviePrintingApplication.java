package com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntFunction;

import com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer.pojos.Movie;



public class SimpleMoviePrintingApplication {
	
	private static Map<Integer, Movie> movieMap = new HashMap<>();

	public static void main(String[] args) {
		Movie movie1 = Movie.builder().movieId(123)
		               .movieName("Black Hawk Down")
		               .movieLanguage("English")
		               .movieRatings(4.0f)
		               .build();
		
		Movie movie2 = Movie.builder().movieId(456)
	               .movieName("Saving Private Ryan")
	               .movieLanguage("English")
	               .movieRatings(5.0f)
	               .build();
		
		Movie movie3 = Movie.builder().movieId(789)
	               .movieName("A walk to remember")
	               .movieLanguage("English")
	               .movieRatings(3.5f)
	               .build();
		
		movieMap.put(movie1.getMovieId(), movie1);
		movieMap.put(movie2.getMovieId(), movie2);
		movieMap.put(movie3.getMovieId(), movie3);
		
		getMoviePrinted();
	}
	
	public static void getMoviePrinted() {
		//Function<Integer, Movie> getMovieFunction = key -> movieMap.get(key);
		
		IntFunction<Movie> getMovieFunction = key -> movieMap.get(key);
		
		Consumer<Integer> printMovie = key -> 
				System.out.println(getMovieFunction.apply(key));
		
		movieMap.keySet().forEach(printMovie);
	}

}
