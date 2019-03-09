package com.kingshuk.javathelanguage.java8.anonymousinnerclass.thiskeyword;

public class ThisKeywordInAnnonymousInnerClassDemo {

	int x = 670;
	int y = 908;

	public void callAdd() {

		DummyFunctionalInterface functionalInterface = new DummyFunctionalInterface() {

			int x = 900;
			int y = 1000;

			/**
			 * Inside annonymous inner class 'this'always refers to current inner class
			 * instance variables only So when the below method is called, it's always going
			 * to print 1900
			 */
			@Override
			public void addCurrenClassValues() {
				System.out.println("The sum is: " + (this.x + this.y));
			}
		};

		functionalInterface.addCurrenClassValues();
	}

	public static void main(String[] args) {

		ThisKeywordInAnnonymousInnerClassDemo demo = new ThisKeywordInAnnonymousInnerClassDemo();

		demo.callAdd();
	}
}
