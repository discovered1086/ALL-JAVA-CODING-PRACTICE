package com.kingshuk.corejava.bharathcourse.innerclasses;

public class NonStaticInnerClassHarness {
	
	void print1() {
		System.out.println("Inside outer class non-static method....");
	}
	
	class InnerClass{
		void print1() {
			System.out.println("Inside inner class non-static method....");
		}
	}

	public static void main(String[] args) {
		NonStaticInnerClassHarness obj1 = new NonStaticInnerClassHarness();
		obj1.print1();
		
		NonStaticInnerClassHarness.InnerClass obj2 = obj1.new InnerClass();
		obj2.print1();
	}

}
