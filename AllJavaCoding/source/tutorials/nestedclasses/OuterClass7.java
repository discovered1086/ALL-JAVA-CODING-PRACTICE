package tutorials.nestedclasses;



class A2 {
	  private InnerA y;
	  protected class InnerA {
	    public InnerA() { System.out.println("A.InnerA()"); }
	  }
	  public A2() {
	    System.out.println("New A()");
	    y = new InnerA();
	  }
	}

	class B1 extends A2 {
	  public class InnerB {
	    public InnerB() { System.out.println("B.InnerB()"); }
	  }
	}

	public class OuterClass7{
	  public static void main(String[] args) {
	    new B1();
	  }
	}
