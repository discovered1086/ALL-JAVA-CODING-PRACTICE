package tutorials.nestedclasses;


class MyClass {
	  private void f() {}
	  class A {
	    private void g() {}
	    public class B {
	      void h() {
	        g();
	        f();
	      }
	    }
	  }
	}

	public class OuterClass9 {
	  public static void main(String[] args) {
	    MyClass a = new MyClass();
	    MyClass.A innerA = a.new A();
	    MyClass.A.B innerb = innerA.new B();
	    innerb.h();
	  }
	}