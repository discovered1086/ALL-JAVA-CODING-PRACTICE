package mypractice.inheritance;

public class DeriveOverloadTest {

	  public static void main(String[] args) {
		    C2 b = new C2();
		    b.doh(1);
		    b.doh('x');
		    b.doh(1.0f);
		    b.doh(new B2());
		  }
		}
class A2 {
	  char doh(char c) {
		    System.out.println("doh(char)");
		    return 'd';
		  }
		  float doh(float f) {
		    System.out.println("doh(float)");
		    return 1.0f;
		  }
		}

		class B2 {}

		class C2 extends A2 {
		  void doh(B2 m) {
		    System.out.println("doh(B)");
		  }
		}

		
		
