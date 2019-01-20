package tutorials.nestedclasses;




interface Counter {
	  int next();
	}

public class OuterClass12 {
	  
	  private int count = 0;
	  Counter getCounter(final String name) {
	    // A local inner class:
	    class LocalCounter implements Counter {
	      public LocalCounter() {
	        // Local inner class can have a constructor
	        System.out.println("LocalCounter()");
	      }
	      public int next() {
	        System.out.print(name); // Access local final
	        return count++;
	      }
	    }
	    return new LocalCounter();
	  }

	  
	  public static void main(String[] args) {
	    OuterClass12 lic = new OuterClass12();
	    Counter c1 = lic.getCounter("Local inner ");
	    System.out.println(c1.next());
	  }
	}