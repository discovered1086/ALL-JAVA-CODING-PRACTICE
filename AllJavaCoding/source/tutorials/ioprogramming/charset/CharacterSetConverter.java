package tutorials.ioprogramming.charset;
import java.io.*;


public class CharacterSetConverter {

  public static void main(String[] args) {
      
    if (args.length < 2) {
      System.err.println(
       "Usage: java CharacterSetConverter infile_encoding outfile_encoding infile outfile");
      return;
    }
    
    try {
      
      File infile = new File(args[2]);
      File outfile = new File(args[3]);
      
      if (infile.getCanonicalPath().equals(outfile.getCanonicalPath())) {
        System.err.println("Can't convert file in place");
        return;
      }
    
      FileInputStream fin = new FileInputStream(infile);
      FileOutputStream fout = new FileOutputStream(outfile);
      InputStreamReader isr = new InputStreamReader(fin, args[0]);
      OutputStreamWriter osw = new OutputStreamWriter(fout, args[1]);
      
      while (true) {
        int c = isr.read();
        if (c == -1) break;  // end of stream
        osw.write(c);
      }
      
      osw.close();
      isr.close();
    }
    catch (IOException e) {
      System.err.println(e);
    }
  
  }

}
