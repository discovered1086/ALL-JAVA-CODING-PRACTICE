package mypractice.basicexamples.classandobject;

public class LineTest {

	  public static void main(String[] arg){
		    Line l1 = new Line(new Point(1,2), new Point(3,4));
		    
		    System.out.println(l1);
		  }
		  
		}
class Point {
	  double x;

	  double y;

	  Point(double xVal, double yVal) {
	    x = xVal;
	    y = yVal;
	  }

	  Point(final Point oldPoint) {
	    x = oldPoint.x;
	    y = oldPoint.y;
	  }

	  void move(double xDelta, double yDelta) {
	    x += xDelta;
	    y += yDelta;
	  }

	  double distance(final Point aPoint) {
	    return Math.sqrt((x - aPoint.x) * (x - aPoint.x) + (y - aPoint.y) * (y - aPoint.y));
	  }

	  public String toString() {
	    return Double.toString(x) + ", " + y;
	  }
	}

	// You can use Point objects in the definition of the class Line:

	class Line {
	  Point start;

	  Point end;

	  Line(final Point start, final Point end) {
	    this.start = new Point(start);
	    this.end = new Point(end);
	  }

	  Line(double xStart, double yStart, double xEnd, double yEnd) {
	    start = new Point(xStart, yStart);
	    end = new Point(xEnd, yEnd);
	  }

	  double length() {
	    return start.distance(end);
	  }

	  public String toString() {
	    return "(" + start + "):(" + end + ")";
	  }
	}


	
	