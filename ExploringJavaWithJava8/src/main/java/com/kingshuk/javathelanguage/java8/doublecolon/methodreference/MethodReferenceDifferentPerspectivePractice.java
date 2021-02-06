package com.kingshuk.javathelanguage.java8.doublecolon.methodreference;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.function.IntSupplier;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
class Person {
	@NonNull
	private String name;

	@NonNull
	private LocalDate dob;

	private int age;

	public int calculateAge() {
		return Period.between(dob, LocalDate.now()).getYears();
	}
}

public class MethodReferenceDifferentPerspectivePractice {

	public static void main(String[] args) {
		// ToIntFunction<Person> calculateAge = p -> p.calculateAge();

		// System.out.println(calculateAge.applyAsInt(new Person("Kingshuk",
		// LocalDate.of(1986, Month.OCTOBER, 16))));

		Person person = new Person("Kingshuk", LocalDate.of(1986, Month.OCTOBER, 16));

		IntSupplier calculateAge = person::calculateAge;

		System.out.println(calculateAge.getAsInt());
	}

}
