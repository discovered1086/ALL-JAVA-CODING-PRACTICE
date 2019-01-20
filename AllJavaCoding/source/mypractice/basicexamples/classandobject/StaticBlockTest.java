package mypractice.basicexamples.classandobject;

public class StaticBlockTest {
	static String tz;

	  static {
	    java.util.Properties p = System.getProperties();
	    p.list(System.out);
	    tz = p.getProperty("user.timezone");
	    if (tz.equals(""))
	      tz = "Default";
	  }

	  public static void main(String[] args) {
	    System.out.println("timezone = " + tz);
	  }
}
