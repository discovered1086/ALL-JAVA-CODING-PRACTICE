package tutorials.ioprogramming.datastream;
import java.io.*;

public class DoubleReader {

  public static void main(String[] args) {
  
    for (int i = 0; i < args.length; i++) {
      
      try {
        FileInputStream fin = new FileInputStream(args[i]);
        // now that we know the file exists, print its name
        System.out.println("-----------" + args[i] + "-----------");
        DataInputStream din = new DataInputStream(fin);
	int fr = 0;
        while (true) {
          double theNumber = readLEDouble(din);
          System.out.println(++fr + "\t" + theNumber);               
        }  // end while        
      } // end try
      catch (EOFException e) {
        // normal termination
      }
      catch (IOException e) {
        // abnormal termination
        System.err.println(e);
      }
      
    }  // end for
    
  }  // end main
  
  
  static double readLEDouble(DataInputStream din) throws EOFException, IOException {
  
    long b8 = din.read();
    long b7 = din.read();
    long b6 = din.read();
    long b5 = din.read();
    long b4 = din.read();
    long b3 = din.read();
    long b2 = din.read();
    long b1 = din.read();
    
    if (b1 == -1 || b2 == -1 || b3 == -1 || b4 == -1 || b5 == -1 || b6 == -1 || b7 == -1 || b8 == -1) {
      throw new EOFException();
    }
    
    long temp = (b1 << 56) | (b2 << 48) | (b3 << 40) | (b4 << 32)
                 | (b5 << 24) | (b6 << 16) | (b7 << 8) | (b8);
    
    return Double.longBitsToDouble(temp);
  }

}  // end DoubleReader
