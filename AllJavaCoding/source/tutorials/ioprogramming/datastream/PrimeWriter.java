package tutorials.ioprogramming.datastream;
import java.io.*;

public class PrimeWriter extends Thread {

  DataOutputStream theOutput;
  int numPrimes;

  public PrimeWriter(OutputStream out, int numPrimes) 
   throws IOException {
    theOutput = new DataOutputStream(out);
    this.numPrimes = numPrimes;
  }

  public PrimeWriter(OutputStream out) throws IOException {
    this(out, Integer.MAX_VALUE);
  }


  public void run() {

    int lastPrime = 1;
    for (int i = 0; i < numPrimes; i++) {
      try {
        lastPrime = nextPrime(lastPrime);
        theOutput.writeInt(lastPrime);
      }
      catch (IOException e) {
        System.err.println(e);
      }
      yield();
    }

  }

  // find the first prime greater than n
  // Archimedes theorem proves such a number exists
  // This is a very inefficient algorithm
  public static int nextPrime(int n) throws IOException {
      
    nextPossibility: for (int possiblePrime = n+1; ; possiblePrime++) {
      // watch for overflow
      if (possiblePrime < 0) throw new IOException("Arithmetic Overflow");
      for (int factor = 2; factor <= Math.sqrt(possiblePrime); factor++) {
        if (possiblePrime % factor == 0) continue nextPossibility;
      }
      return possiblePrime;
    }

  }

}
