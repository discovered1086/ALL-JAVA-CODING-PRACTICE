package com.kingshuk.reflectionsannotations.annotations.harness;

@FunctionalInterface
interface MyInterface {

	void m1();
}

@SuppressWarnings({"squid:S106", "squid:S1133"})
public class GeneralPurposeAnnotationDemo {

	public static void main(String[] args) {
		MyInterface myInterface = () -> {
			System.out.println(" This is an implementation of lambda expression");
		};

		myInterface.m1();

	}

	@SuppressWarnings("unused")
	private void m2() {
		System.out.println(" This is an implementation of lambda" + "expression through method reference");
	}

	/**
	 * @deprecated (Since 1.1 because this is no longer compatible with spring)
	 */
	@Deprecated
	public void m3() {
		System.out.println(
				" This is an implementation of lambda" + "expression through method reference -  instance method");
	}

}
