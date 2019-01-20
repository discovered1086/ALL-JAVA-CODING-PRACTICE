package tutorials.nestedclasses;



class W {
	  protected class InnerW {
	    public InnerW() {
	      System.out.println("W.InnerA()");
	    }

	    public void f() {
	      System.out.println("W.InnerA.f()");
	    }
	  }

	  private InnerW y = new InnerW();

	  public W() {
	    System.out.println("New W()");
	  }

	  public void insertZolk(InnerW yy) {
	    y = yy;
	  }

	  public void g() {
	    y.f();
	  }
	}

	class Z extends W {
	  public class InnerZ extends InnerW {
	    public InnerZ() {
	      System.out.println("B.InnerB()");
	    }

	    public void f() {
	      System.out.println("B.InnerB.f()");
	    }
	  }

	  public Z() {
	    insertZolk(new InnerZ());
	  }

	}

	public class OuterClass10 {
	  public static void main(String[] args) {
	    W e2 = new Z();
	    e2.g();
	  }
	}