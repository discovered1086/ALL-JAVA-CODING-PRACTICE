package tutorials.nestedclasses;

public class OuterClass2 {


	  class A {
	    private int i = 11;

	    public int value() {
	      return i;
	    }
	  }

	  class B {
	    private String label;

	    B(String whereTo) {
	      label = whereTo;
	    }

	    String readLabel() {
	      return label;
	    }
	  }
	  
	  public B to(String s) {
		    return new B(s);
		  }

		  public A cont() {
		    return new A();
		  }

	  // Using inner classes looks just like
	  // using any other class, within MainClass:
	  public void print(String dest) {
	    A c = new A();
	    B d = new B(dest);
	    System.out.println(d.readLabel());
	  }

	  public static void main(String[] args) {
	    OuterClass2 p = new OuterClass2();
	    p.print("Test");
	    
	    OuterClass2 q = new OuterClass2();

	    A c = q.cont();
	    B d = q.to("A");
	  }
	}
