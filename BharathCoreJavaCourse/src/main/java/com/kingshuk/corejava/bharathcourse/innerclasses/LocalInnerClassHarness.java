package com.kingshuk.corejava.bharathcourse.innerclasses;

public class LocalInnerClassHarness {
	
	void print1() {
		System.out.println("Inside outer class print1 method....");
		
		class LocalInnerClass{
			void print2() {
				System.out.println("Inside inner class print2 method....");
			}
		}
		
		LocalInnerClass li = new LocalInnerClass();
		li.print2();
	}

	public static void main(String[] args) {
		
		LocalInnerClassHarness outer = new LocalInnerClassHarness();
		outer.print1();
	}

}
