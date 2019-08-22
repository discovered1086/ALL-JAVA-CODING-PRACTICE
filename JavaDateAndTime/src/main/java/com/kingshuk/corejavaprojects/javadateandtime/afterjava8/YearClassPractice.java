package com.kingshuk.corejavaprojects.javadateandtime.afterjava8;

import java.time.Year;
import java.util.Scanner;

public class YearClassPractice {

	public static void main(String[] args) {
		
		/*
		 * Scanner class is specially designed to read input from the keyboard.
		 * 
		 * This class is present in the java.util package
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter year: ");
		
		int input = sc.nextInt();
		
		sc.close();
		
		Year year = Year.of(input);
		
		System.out.println("Is input leap year?"+year.isLeap());
		
		
	}

}
