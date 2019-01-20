package tutorials.nestedclasses;




interface InterfaceA {
	  void increment();
	}

	class ClassA implements InterfaceA {
	  private int i = 0;

	  public void increment() {
	    i++;
	    System.out.println(i);
	  }
	}

	class ClassB {
	  void increment() {
	    System.out.println("Other operation");
	  }

	  static void f(ClassB mi) {
	    mi.increment();
	  }
	}

	class ClassC extends ClassB {
	  private int i = 0;

	  private void incr() {
	    i++;
	    System.out.println(i);
	  }

	  private class Closure implements InterfaceA {
	    public void increment() {
	      incr();
	    }
	  }

	  InterfaceA getCallbackReference() {
	    return new Closure();
	  }
	}

	class Caller {
	  private InterfaceA callbackReference;

	  Caller(InterfaceA cbh) {
	    callbackReference = cbh;
	  }

	  void go() {
	    callbackReference.increment();
	  }
	}

	public class OuterClass11 {
	  public static void main(String[] args) {
	    ClassA c1 = new ClassA();
	    ClassC c2 = new ClassC();
	    ClassB.f(c2);
	    Caller caller1 = new Caller(c1);
	    Caller caller2 = new Caller(c2.getCallbackReference());
	    caller1.go();
	    caller1.go();
	    caller2.go();
	    caller2.go();
	  }
	}