package com.kingshuk.javathelanguage.java8.optional.harness;

import java.util.Optional;

import com.kingshuk.javathelanguage.java8.optional.beans.Address;
import com.kingshuk.javathelanguage.java8.optional.beans.Person;

public class OptionalFilter {

	public static void main(String[] args) {
		Person person = Person.builder().age(32).name("Kingshuk").build();

		// Address address1 = Address.builder().addressLine1("1525 Busch
		// Pkwy").city("Buffalo Grove").build();

		Address address2 = Address.builder().addressLine1("279 Broome St").city("New York").build();

		person.setAddress(address2);

		Optional<Address> address = Optional.of(person.getAddress());

		address.filter(addressVar -> "Buffalo Grove".equals(addressVar.getCity())).ifPresent(System.out::println);
	}

}
