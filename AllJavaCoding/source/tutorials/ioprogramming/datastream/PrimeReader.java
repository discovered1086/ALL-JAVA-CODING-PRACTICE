package tutorials.ioprogramming.datastream;
import java.io.*;

public class PrimeReader extends Thread {

  DataInputStream theInput;

  public PrimeReader(InputStream in) 
   throws IOException {
    theInput = new DataInputStream(in);
  }

  public void run() {

    try {
      while (true) {
        System.out.println(theInput.readInt());
      }
    }
    catch (IOException e) {
      // probably just an end of stream exception
    }

  }

}