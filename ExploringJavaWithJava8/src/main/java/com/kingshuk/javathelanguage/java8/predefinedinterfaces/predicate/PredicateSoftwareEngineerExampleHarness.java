package com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.Person.PersonOccupation;
import com.kingshuk.javathelanguage.java8.predefinedinterfaces.predicate.Person.RelationShipStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Person{
	
	private String name;
	
	private int age;
	
	private PersonOccupation occupation;
	
	enum PersonOccupation{
		SOFTWARE_ENGINEER,
		GOVT_EMPLOYEE,
		PUB_OWNER,
		ARCHITECT
		
	}
	
	enum RelationShipStatus{
		MARRIED,
		ENGAGED,
		SINGLE,
		SEPERATED,
		DIVORCED
	}
	
	private RelationShipStatus relationShipStatus;
}
public class PredicateSoftwareEngineerExampleHarness {

	public static void main(String[] args) {
		
		Person person1 = new Person("Kingshuk Mukherjee",32, PersonOccupation.SOFTWARE_ENGINEER, RelationShipStatus.MARRIED);
		
		Person person2 = new Person("Deeksha Banerjee",29, PersonOccupation.ARCHITECT, RelationShipStatus.SINGLE);
		
		Predicate<Person> personPredicate = person -> person.getAge()>=18 
				&& !PersonOccupation.SOFTWARE_ENGINEER.equals(person.getOccupation())
				&& !RelationShipStatus.SINGLE.equals(person.getRelationShipStatus());
		
		List<Person> persons = Arrays.asList(person1,person2);
		
		allowedInThePub(personPredicate, persons);
		

	}
	
	public static void allowedInThePub(Predicate<Person> p, List<Person> personList) {
		
		personList.forEach(person ->{
			if(p.test(person)) {
				System.out.println(person.getName()+" is allowed in the pub");
			}else {
				System.out.println(person.getName()+" is NOT allowed in the pub");
			}
		});
		
	}

}
