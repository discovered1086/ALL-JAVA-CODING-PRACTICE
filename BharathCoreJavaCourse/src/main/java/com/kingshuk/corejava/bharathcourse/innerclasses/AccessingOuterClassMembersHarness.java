package com.kingshuk.corejava.bharathcourse.innerclasses;

import lombok.Getter;

@Getter
public class AccessingOuterClassMembersHarness {

	private static final String x = "Hello from static final";
	private String y;

	public AccessingOuterClassMembersHarness(String y) {
		this.y = y;
	}

	void print1() {
		System.out.println("Inside outer class non-static method....");
	}

	class InnerClass {
		private String y;

		public InnerClass(String y) {
			this.y = y;
		}

		void print1() {
			System.out.println("Inside inner class non-static method....");
			System.out.println("<<Inner class print method>> X: "+ AccessingOuterClassMembersHarness.x);
			System.out.println("<<Inner class print method>> Y: "+ AccessingOuterClassMembersHarness.this.y);
			System.out.println("<<Inner class print method>> Y: "+ this.y);
		}

	}

	public static void main(String[] args) {
		AccessingOuterClassMembersHarness outer = new AccessingOuterClassMembersHarness("Hello from outer member");

		outer.print1();

		AccessingOuterClassMembersHarness.InnerClass inner = outer.new InnerClass("Hello from inner member");

		inner.print1();
	}

}
