package com.kingshuk.javathelanguage.java8.predefinedinterfaces.consumer.pojos;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
	private Integer movieId;

	private String movieName;

	private String movieLanguage;

	private Float movieRatings;

	private List<Actor> actors;

	@Override
	public String toString() {
		StringBuilder printStatement = new StringBuilder().append(String.format(
				"The movie '%s' is a(n) %s movie that got %.1f rating and \n" + "the following actors starred in it.\n",
				this.movieName, this.movieLanguage, this.movieRatings));

		actors.forEach(actor -> printStatement.append(actor.getName()).append("\n"));

		return printStatement.toString();

	}
}
