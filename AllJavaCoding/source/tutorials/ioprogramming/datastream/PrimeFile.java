package tutorials.ioprogramming.datastream;
import java.io.*;


public class PrimeFile {

  public static void main(String args[]) {

      String outputFile = "primes.dat";
      if (args.length > 0) outputFile = args[0];
      int numPrimes;
      try {
        numPrimes = Integer.parseInt(args[1]);
      }
      catch (Exception e) {
        numPrimes = 100;
      }
     
      try {
        ByteArrayOutputStream bout = new ByteArrayOutputStream(numPrimes*4);
        DataOutputStream dout = new DataOutputStream(bout);
        int lastPrime = 1;
        for (int i = 0; i < numPrimes; i++) {
          lastPrime = nextPrime(lastPrime);
          dout.writeInt(lastPrime);
        }
        FileOutputStream fout = new FileOutputStream(outputFile);
        fout.write(bout.toByteArray());
        fout.flush();
        fout.close();
      }
      catch (IOException e) {
        System.err.println(e);
      }

  }

  // find the first prime greater than n
  // Archimedes theorem proves such a number exists
  // This is a very inefficient algorithm
  // wrap-around is not handled. 
  public static int nextPrime(int n) {
      
    nextPossibility: for (int possiblePrime = n+1; ; possiblePrime++) {
      for (int factor = 2; factor <= Math.sqrt(possiblePrime); factor++) {
        if (possiblePrime % factor == 0) continue nextPossibility;
      }
      return possiblePrime;
    }

  }

}
