package mypractice.inheritance;

public class ConstructionOrder {


		  public static void main(String[] args) {
		    C x = new C();
		  }
		}
class A {
	  A(int i) {
		    System.out.println("A constructor");
		  }
		}

		class B extends A {
		  B(int i) {
		    super(i);
		    System.out.println("B constructor");
		  }
		}

		class C extends B {
		  C() {
		    super(11);
		    System.out.println("C constructor");
		  }
		}

		
