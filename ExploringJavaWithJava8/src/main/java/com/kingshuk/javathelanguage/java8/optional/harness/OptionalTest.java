package com.kingshuk.javathelanguage.java8.optional.harness;

import java.util.Optional;

import com.kingshuk.javathelanguage.java8.optional.beans.Address;
import com.kingshuk.javathelanguage.java8.optional.beans.Person;

public class OptionalTest {

	public static void main(String[] args) {
		Person person = Person.builder().age(32).name("Kingshuk").build();

		Address address = Address.builder().addressLine1("1525 Busch Pkwy").city("Buffalo Grove").build();

		person.setAddress(address);

		Optional<Address> addressOptional = Optional.ofNullable(person.getAddress());

		addressOptional.ifPresent(System.out::println);
	}

}
