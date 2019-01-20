package tutorials.nestedclasses;

public class OuterClass5 {
	
		  private void method(boolean b) {
		    if (b) {
		      class A {
		        private String id;

		        A(String s) {
		          id = s;
		        }

		        String getSlip() {
		          return id;
		        }
		      }
		      A ts = new A("slip");
		      String s = ts.getSlip();
		    }
		    // Can't use it here! Out of scope:
		    // ! A ts = new A("x");
		  }

		  public void track() {
		    method(true);
		  }

		  public static void main(String[] args) {
		    OuterClass5 p = new OuterClass5();
		    p.track();
		  }
		}
