package tutorials.nestedclasses;

public class OuterClass4 {
	
		  public A dest(String s) {
		    class B implements A {
		      private String label;

		      private B(String whereTo) {
		        label = whereTo;
		      }

		      public String readLabel() {
		        return label;
		      }
		      
		    }
		    return new B(s);
		  }

		  public static void main(String[] args) {
		    OuterClass4 p = new OuterClass4();
		    A d = p.dest("A");
		  }
		}

		interface A {
		  String readLabel();
		  
		}