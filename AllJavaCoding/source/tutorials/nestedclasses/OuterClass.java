package tutorials.nestedclasses;

public  class OuterClass {
	 private class A {
		    private int i = 11;

		    public int value() {
		      return i;
		    }
		  }

		 protected class B {
		    private String label;

		    B(String whereTo) {
		      label = whereTo;
		    }

		    String readLabel() {
		      return label;
		    }
		  }

		  public static void main(String[] args) {
		    OuterClass p = new OuterClass();
		    // Must use instance of outer class
		    // to create an instances of the inner class:
		   A c = p.new A();
		    B d = p.new B("A");
		  }
}

class NestedTest{
	public static void main(String [] a )
	{
		  OuterClass p = new OuterClass();
		   // A c = p.new A();
		  OuterClass.B d = p.new B("A");
	}
}
