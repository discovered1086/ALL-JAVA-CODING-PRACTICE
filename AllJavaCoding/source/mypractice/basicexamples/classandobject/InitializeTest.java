package mypractice.basicexamples.classandobject;


	class A {
		  A(int marker) {
		    System.out.println("Bowl(" + marker + ")");
		  }

		  void f(int marker) {
		    System.out.println("f(" + marker + ")");
		  }
		}

		class B {
		  static A a = new A(1);

		  B() {
		    System.out.println("Table()");
		    staticA.f(1);
		  }

		  void f2(int marker) {
		    System.out.println("f2(" + marker + ")");
		  }

		  static A staticA = new A(2);
		}

		class C {
		  A a = new A(3);

		  static A staticA = new A(4);

		  C() {
		    System.out.println("Cupboard()");
		    staticA.f(2);
		  }

		  void f3(int marker) {
		    System.out.println("f3(" + marker + ")");
		  }

		  static A staticA2 = new A(5);
		}

		public class InitializeTest {
		  public static void main(String[] args) {
		    System.out.println("Creating new Cupboard() in main");
		    new C();
		    System.out.println("Creating new Cupboard() in main");
		    new C();
		    t2.f2(1);
		    t3.f3(1);
		  }

		  static B t2 = new B();

		  static C t3 = new C();
		}

