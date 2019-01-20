package tutorials.nestedclasses;

interface C {
}

interface D {
}

class X implements C, D {
}

class Y implements C {
  D makeD() {
    // Anonymous inner class:
    return new D() {
    };
  }
}

public class OuterClass8 {
  static void takesC(C a) {
  }

  static void takesD(D b) {
  }

  public static void main(String[] args) {
    X x = new X();
    Y y = new Y();
    takesC(x);
    takesC(y);
    takesD(x);
    takesD(y.makeD());
  }
}