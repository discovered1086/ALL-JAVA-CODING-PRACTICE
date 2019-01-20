package tutorials.ioprogramming.serialization;
import java.io.*;

public class InnerTest implements Serializable {

  int y = 73;
  Inner test = new Inner();
  
  public static void main(String[] args) {
  
    try {
      FileOutputStream fout = new FileOutputStream("innertest.ser");
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      oout.writeObject(new InnerTest());
      oout.close();
    }
    catch (IOException e) {
      System.err.println(e);
      e.printStackTrace();
    }
    
  }


  class Inner implements Serializable {
   
   int x = 7;
  
  }

}