package com.kingshuk.javathelanguage.java8.predefinedinterfaces.functions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.IntPredicate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Student {
	private String name;

	private int marks;
}

public class StudentGradeFunctionTest {
	private static Map<IntPredicate, String> gradeCodeMap = new HashMap<>();

	static {

		gradeCodeMap.put(n -> n >= 80, "A");
		gradeCodeMap.put(n -> n >= 65 && n < 80, "B");
		gradeCodeMap.put(n -> n >= 50 && n < 65, "C");
		gradeCodeMap.put(n -> n >= 35 && n < 50, "D");
		gradeCodeMap.put(n -> n < 35, "E");
	}

	public static void main(String[] args) {

		Function<Integer, String> gradeFinderFunction = marks -> {
			String grade = "";
			/*
			 * gradeCodeMap.entrySet().forEach(entry -> { if (((Predicate<Integer>)
			 * entry).test(marks)) { grade=gradeCodeMap.get(entry); } });
			 */

			for (IntPredicate predicate : gradeCodeMap.keySet()) {
				if (predicate.test(marks)) {
					grade = gradeCodeMap.get(predicate);
				}
			}
			return grade;
		};

		List<Student> students = Arrays.asList(new Student("Kingshuk", 65), new Student("Deeksha", 95),
				new Student("Amit", 85), new Student("Mainak", 25));

		students.forEach(student -> {
			System.out
					.println("Grade for " + student.getName() + " is " + gradeFinderFunction.apply(student.getMarks()));
		});
	}

}
