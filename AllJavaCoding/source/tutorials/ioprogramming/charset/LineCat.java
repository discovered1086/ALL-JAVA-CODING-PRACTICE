package tutorials.ioprogramming.charset;
import java.io.*;


public class LineCat  {

  public static void main (String args[]) {
  
    String thisLine;
 
    // Loop across the arguments
    for (int i=0; i < args.length; i++) {
 
     //Open the file for reading
     try {
       LineNumberReader br = new LineNumberReader(new FileReader(args[i]));
       while ((thisLine = br.readLine()) != null) { 
         System.out.println(br.getLineNumber() + ": " + thisLine);
        } // end while 
      } // end try
      catch (IOException e) {
        System.err.println("Error: " + e);
      }
    } // end for
  
  } // end main

}
