package com.kingshuk.javathelanguage.java8.anonymousinnerclass.outervariables;

@FunctionalInterface
interface DummyFunctionalInterface2{
	void m1();
}

public class LambdaExpressionWrtOuterVariables {
	int x=10;
	
	public void m2() {
		int y=20;
		
		DummyFunctionalInterface2 functionalInterface2 = ()->{
			/**
			 * We can directly access the outer class and outer method variables from
			 * within a lambda expression
			 */
			System.out.println("The value of X is "+x);
			System.out.println("The value of Y is "+y);
		};
		
		functionalInterface2.m1();
	}

	public static void main(String[] args) {
		
		LambdaExpressionWrtOuterVariables mainClass = new LambdaExpressionWrtOuterVariables();
		
		mainClass.m2();

	}

}
