package mypractice.inheritance;

public class CompositionTest {
	public static void main(String[] args) {
	    SubC x = new SubC(9);
	  }
}
class A1 {
	  A1(int i) {
	    System.out.println("A constructor");
	  }
	}

	class SubA extends A1 {
	  SubA(int i) {
	    super(i);
	    System.out.println("SubA constructor");
	  }
	}

	class B1 {
	  B1(int i) {
	    System.out.println("B constructor");
	  }
	}

	class SubB1 extends B1 {
	  SubB1(int i) {
	    super(i);
	    System.out.println("SubB1 constructor");
	  }
	}

	class SubB2 extends B {
	  SubB2(int i) {
	    super(i);
	    System.out.println("SubB2 constructor");
	  }
	}

	class SubB3 extends B {
	  SubB3(int i) {
	    super(i);
	    System.out.println("SubB3 constructor");
	  }
	}

	// A cultural way of doing something:
	class C1 {
	  C1(int i) {
	    System.out.println("C constructor");
	  }
	}

	class SubC extends C1 {
	  private SubB1 subB1;
	  private SubB2 subB2;
	  private SubB3 subB3;
	  private SubA subA;
	  public SubC(int i) {
	    super(i + 1);
	    subB1 = new SubB1(i + 2);
	    subB2 = new SubB2(i + 3);
	    subB3 = new SubB3(i + 4);
	    subA = new SubA(i + 5);
	    System.out.println("SubC constructor");
	  }
	}

	