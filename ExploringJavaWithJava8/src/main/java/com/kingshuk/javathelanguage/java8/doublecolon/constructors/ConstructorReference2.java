package com.kingshuk.javathelanguage.java8.doublecolon.constructors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@FunctionalInterface
interface ObjectFactory{
	PersonModified getPersonModified(String name, int age);
}

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class PersonModified{
	
	private String name;
    private int age;
	
}
public class ConstructorReference2 {

	public static void main(String[] args) {
		ObjectFactory factory = PersonModified::new;
		
		PersonModified personModified = 
				factory.getPersonModified("Kingshuk Mukherjee", 32);
		
		System.out.println(personModified);
	}

}
