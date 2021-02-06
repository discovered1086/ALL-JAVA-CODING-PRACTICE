package com.kingshuk.corejava.bharathcourse.innerclasses;

import lombok.Getter;

public class StaticInnerClassHarness {

	static void print1() {
		System.out.println("Inside outer class static method....");
	}

	@Getter
	static class InnerClass {
		int y;
		
		
		public InnerClass(int y) {
			this.y = y;
		}

		static void print1() {
			System.out.println("Inside inner class static method....");
		}
		
		void print2() {
			System.out.println("Inside inner class non-static method...." +y);
		}
	}

	public static void main(String[] args) {
		StaticInnerClassHarness.print1();
		
		StaticInnerClassHarness.InnerClass.print1();
		
		StaticInnerClassHarness.InnerClass obj = new StaticInnerClassHarness.InnerClass(38);
		
		obj.print2();
		
		obj.getY();
	}

}
