package mypractice.inheritance;

public class ConstructorOverload {
	
		  int height;

		  ConstructorOverload() {
		    System.out.println("Planting a seedling");
		    height = 0;
		  }

		  ConstructorOverload(int i) {
		    System.out.println("Creating new Tree that is " + i + " feet tall");
		    height = i;
		  }

		  void info() {
		    System.out.println("Tree is " + height + " feet tall");
		  }

		  void info(String s) {
		    System.out.println(s + ": Tree is " + height + " feet tall");
		  }
		

		
		  public static void main(String[] args) {
		    ConstructorOverload t = new ConstructorOverload(0);
		    t.info();
		    t.info("overloaded method");
		    // Overloaded constructor:
		    new MyClass();
		  }
		}

