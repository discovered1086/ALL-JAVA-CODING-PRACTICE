package com.kingshuk.javathelanguage.java8.optional.harness;

import java.util.Optional;

import com.kingshuk.javathelanguage.java8.optional.beans.Address;
import com.kingshuk.javathelanguage.java8.optional.beans.Person;

public class OptionalMapHarness {

	public static void main(String[] args) {
		Optional<Person> person = Optional.ofNullable(buildPersonObject());

		person.map(person1 -> {
			if (Optional.ofNullable(person1.getAddress()).isPresent() && "NY".equals(person1.getAddress().getCity())) {
				person1.getAddress().setCity("New York");
			}

			return person1.getAddress();
		}).filter(address -> "New York".equals(address.getCity())).ifPresent(System.out::println);

	}

	private static Person buildPersonObject() {
		Person person = Person.builder().age(32).name("Kingshuk").build();

		// Address address1 = Address.builder().addressLine1("1525 Busch
		// Pkwy").city("Buffalo Grove").build();

		Address address2 = Address.builder().addressLine1("279 Broome St").city("NY").build();

		person.setAddress(address2);

		return person;
	}

}
