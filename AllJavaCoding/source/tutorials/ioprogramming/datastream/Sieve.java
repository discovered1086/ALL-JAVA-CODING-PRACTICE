package tutorials.ioprogramming.datastream;

import java.io.*;


public class Sieve {

  static int[] primes;
  static int primesFound = 0;

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
      primes = new int[numPrimes];
      
      try {
        ByteArrayOutputStream bout = new ByteArrayOutputStream(numPrimes*4);
        DataOutputStream dout = new DataOutputStream(bout);
        primes[0] = 2;
        primesFound = 1;
        int lastPrime = 2;
        while (primesFound < numPrimes) {
          lastPrime = nextPrime(lastPrime);
          dout.writeInt(lastPrime);
	  primes[primesFound++] = lastPrime;
        }
        FileOutputStream fout = new FileOutputStream(outputFile);
        fout.write(bout.toByteArray());
        fout.flush();
        fout.close();
      }
      catch (IOException e) {
        System.err.println(e);
      }
      catch (Exception e) {
        e.printStackTrace();
      }

  }

  // find the first prime greater than n
  // Archimedes theorem proves such a number exists
  // wrap-around is not handled. 
  private static int nextPrime(int lastPrime) {
      
    nextPossibility: for (int possiblePrime = lastPrime+1; ; possiblePrime++) {
      for (int i = 0; i < primesFound; i++) {
        if (possiblePrime % primes[i] == 0) continue nextPossibility;
      }
      return possiblePrime;
    }

  }

}

