package mypractice.basicexamples.classandobject;

public class Sphere {
	
		  double radius; // Radius of a sphere
		  double xCenter;
    	  double yCenter;
		  double zCenter;

		  Sphere() {
		    radius = 1;
		  }
		  Sphere(double x, double y, double z) {
		    this();
		    xCenter = x;
		    yCenter = y;
		    zCenter = z;
		  }
		  Sphere(int theRadius, double x, double y, double z) {
			    this(x, y, z);
			    radius = theRadius;
		  }
		  // Class constructor
		  Sphere(double theRadius) {
		    radius = theRadius; // Set the radius
		  }
		// Create a sphere from an existing object
        Sphere(final Sphere oldSphere) {
		    radius = oldSphere.radius;
		    xCenter = oldSphere.xCenter;
		    yCenter = oldSphere.yCenter;
		    zCenter = oldSphere.yCenter;
		  }		  
		  
		  public static void main(String[] arg){
		    Sphere sp = new Sphere();
		    aMethod(sp);
		  }
		  private static void aMethod(Sphere sp){
			    System.out.println(sp);
			  }
		}