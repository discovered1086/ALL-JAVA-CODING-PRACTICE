package tutorials.ioprogramming.datastream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;


public class PrimeDriver {

  public static void main (String[] args) {

    int howMany;
    try {
      howMany = Integer.parseInt(args[0]);
    }
    catch (Exception e) {
      howMany = Integer.MAX_VALUE;
    }

    try {
      PipedOutputStream pout = new PipedOutputStream();
      PipedInputStream pin = new PipedInputStream(pout);

      FibonacciWriter fw = new FibonacciWriter(pout, howMany);
      FibonacciReader fr = new FibonacciReader(pin);
      fw.start();
      fr.start();
    }
    catch (IOException e) {
      System.err.println(e);
    }

  } 

}
