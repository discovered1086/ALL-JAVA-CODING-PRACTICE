package com.kingshuk.javathelanguage.java8.predefinedinterfaces.twoarguments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
class Student {
	private String name;

	private Integer rollNo;
}

public class BiFunctionStudentPractice {

	public static void main(String[] args) {
		List<Student> listOfStudents = new ArrayList<>();

		BiFunction<String, Integer, Student> studentCreation = Student::new;

		listOfStudents.add(studentCreation.apply("Kingshuk Mukherjee", 10));
		listOfStudents.add(studentCreation.apply("Deeksha Banerjee", 20));

		listOfStudents.forEach(System.out::println);
	}

}
