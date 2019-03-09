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
			 * 
			 * But the local variables within the enclosing method act as final variables 
			 * if they're used inside the lambda expression
			 */
			x = x+10;
						
			System.out.println("The value of X is "+x);
			//System.out.println("The value of Y is "+y);
		};
		
		y=y+100;
		
		functionalInterface2.m1();
	}

	public static void main(String[] args) {
		
		LambdaExpressionWrtOuterVariables mainClass = new LambdaExpressionWrtOuterVariables();
		
		mainClass.m2();

	}

}
