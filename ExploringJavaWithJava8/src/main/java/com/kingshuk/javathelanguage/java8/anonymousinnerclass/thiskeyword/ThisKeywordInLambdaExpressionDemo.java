package com.kingshuk.javathelanguage.java8.anonymousinnerclass.thiskeyword;

public class ThisKeywordInLambdaExpressionDemo {

	int x = 670;
	int y = 908;

	public void callAdd() {

		DummyFunctionalInterface functionalInterface = () -> {

			int x = 900;
			int y = 1000;

			/**
			 * Inside lambda expression 'this'always refers to instance variables of the
			 * parent class only So when the below method is called, it's always going to
			 * print 1578
			 */

			System.out.println("The sum is: " + (this.x + this.y));

		};

		functionalInterface.addCurrenClassValues();
	}

	public static void main(String[] args) {

		ThisKeywordInLambdaExpressionDemo demo = new ThisKeywordInLambdaExpressionDemo();

		demo.callAdd();
	}
}
