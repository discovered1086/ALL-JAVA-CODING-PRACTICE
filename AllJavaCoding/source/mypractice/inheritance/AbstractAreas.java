package mypractice.inheritance;

abstract class AbstractArea {
	  double dim1;

	  double dim2;

	  AbstractArea(double a, double b) {
	    dim1 = a;
	    dim2 = b;
	  }

	  abstract double area();
	}

	class Rectangle extends AbstractArea {
	  Rectangle(double a, double b) {
	    super(a, b);
	  }

	  double area() {
	    System.out.println("Inside Area for Rectangle.");
	    return dim1 * dim2;
	  }
	}

	class Triangle extends AbstractArea {
	  Triangle(double a, double b) {
	    super(a, b);
	  }

	  double area() {
	    System.out.println("Inside Area for Triangle.");
	    return dim1 * dim2 / 2;
	  }
	}

	public class AbstractAreas {
	  public static void main(String args[]) {
	    Rectangle r = new Rectangle(9, 5);
	    Triangle t = new Triangle(10, 8);
	    AbstractArea figref;

	    figref = r;
	    System.out.println("Area is " + figref.area());

	    figref = t;
	    System.out.println("Area is " + figref.area());
	  }
	}
