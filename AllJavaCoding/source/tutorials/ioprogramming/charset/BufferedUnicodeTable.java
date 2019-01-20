package tutorials.ioprogramming.charset;
import java.io.*;


public class BufferedUnicodeTable {

  public static void main(String[] args) {
  
    String encoding = System.getProperty("font.encoding", "8859_1");
    OutputStream target = System.out;
    try {
      if (args.length > 0) target = new FileOutputStream(args[0]);
    }
    catch (IOException e) {
      System.err.println("Sending text to System.out");
    }
    if (args.length > 1) encoding = args[1];
    
    OutputStreamWriter osw = null;
    try {
      osw = new OutputStreamWriter(target, encoding); 
    }
    catch (UnsupportedEncodingException e) {
      osw = new OutputStreamWriter(target);
    }
    
    BufferedWriter bw = new BufferedWriter(osw);
    try {
      
      for (int i = Character.MIN_VALUE; i < Character.MAX_VALUE; i++) {
        char c = (char) i;
        bw.write(i + ":\t" + c);
        bw.newLine();
      }
      bw.close();
    }
    catch (IOException e) {
      System.err.println(e);
    }
  
  }

}
