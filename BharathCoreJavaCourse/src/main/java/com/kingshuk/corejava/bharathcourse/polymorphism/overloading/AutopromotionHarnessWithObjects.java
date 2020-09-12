package com.kingshuk.corejava.bharathcourse.polymorphism.overloading;

import com.kingshuk.corejava.bharathcourse.polymorphism.MacbookAir;
import com.kingshuk.corejava.bharathcourse.polymorphism.MacbookLaptop;
import com.kingshuk.corejava.bharathcourse.polymorphism.MacbookPro;

public class AutopromotionHarnessWithObjects {

	public void print(MacbookLaptop macbookLaptop) {
		macbookLaptop.start();
	}

//	public void print(MacbookAir macbookLaptop) {
//		macbookLaptop.start();
//	}
	
//	public void print(MacbookPro macbookLaptop) {
//		macbookLaptop.start();
//	}

	public static void main(String[] args) {
		AutopromotionHarnessWithObjects ap = new AutopromotionHarnessWithObjects();
		ap.print(new MacbookAir());
		ap.print(new MacbookLaptop());
		ap.print(new MacbookPro());
	}

}
