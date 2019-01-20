package tutorials.nestedclasses;

public class OuterClass6 {
	
		  private static class ClassA implements A1 {
		    private int i = 11;

		    public int value() {
		      return i;
		    }
		  }

		  protected static class ClassB implements B {
		    private String label;

		    private ClassB(String whereTo) {
		      label = whereTo;
		    }

		    public String readLabel() {
		      return label;
		    }

		    // Nested classes can contain other static elements:
		    public static void f() {
		    }

		    static int x = 10;

		    static class InnerInnerClass {
		      public static void f() {
		      }

		      static int x = 10;
		    }
		  }

		  public static B dest(String s) {
		    return new ClassB(s);
		  }

		  public static A1 cont() {
		    return new ClassA();
		  }

		  public static void main(String[] args) {
		    A1 c = cont();
		    B d = dest("A");
		  }
		}

		interface A1 {
			int value();
		}

		interface B {
		  String readLabel();
		}