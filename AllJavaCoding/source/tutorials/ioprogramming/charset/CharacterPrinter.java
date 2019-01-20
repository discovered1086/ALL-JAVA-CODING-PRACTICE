package tutorials.ioprogramming.charset;
import java.io.*;

public class CharacterPrinter {

  public static void main(String[] args) {

    for (int i = 0; i < args.length; i++) {
      printCharacters(args[i]);    
    }

  }
  
  public static void printCharacters(String s) {
  
    StringReader sr = new StringReader(s);
    try {
      int c;
      while ((c = sr.read()) != -1) {
        System.out.println((char) c);
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    return;
    
  }

}
