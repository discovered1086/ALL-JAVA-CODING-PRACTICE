package mypractice.inheritance;

public class MultipleInterface {

  public static void main(String[] a) {
    MyClass cls = new MyClass();
    cls.thisMethod();
    cls.thatMethod();
  }

}interface ThisInterface {
  public void thisMethod();
}

interface ThatInterface {
  public void thatMethod();
}

class MyClass implements ThisInterface, ThatInterface {
  // Class definition including methods from both interfaces...
  public void thisMethod() {
    System.out.println("this");
  }

  public void thatMethod() {
    System.out.println("that");
  }
}


