package tutorials.ioprogramming.datastream;
import java.io.*;


public class PipedTest {

  public static void main(String[] args)  {
  
    try {
    
      PipedOutputStream pout = new PipedOutputStream();
      PipedInputStream pin = new PipedInputStream(pout);
      System.out.println("Y");
      for (int i = 0; i < 10; i++) {
        System.out.println(pin.read());
      }
      System.out.println("Z");
      for (int i = 0; i < 1024; i++) {
        pout.write(1);
      }
      System.out.println("A");
      for (int i = 0; i < 1024; i++) {
        pout.write(2);
      }
      System.out.println("B");
      for (int i = 0; i < 10; i++) {
        System.out.println(pin.read());
      }
      
    }
    catch (IOException e) {
      System.err.println(e);
    }
    
    
  }


}