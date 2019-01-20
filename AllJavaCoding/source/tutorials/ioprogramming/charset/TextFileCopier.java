package tutorials.ioprogramming.charset;
import java.io.*;


public class TextFileCopier {

  public static void main(String[] args) {

    if (args.length != 2) {
      System.err.println("Usage: java TextFileCopier file1 file2");
    }
    try {
      copyFile(args[0], args[1]);
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }

  public static void copyFile(String file1, String file2) throws IOException {
    
    File infile = new File(file1);
    File outfile = new File(file2);
      
    if (infile.getCanonicalPath().equals(outfile.getCanonicalPath())) {
      return;
    }

    FileReader fr = new FileReader(infile);
    FileWriter fw = new FileWriter(outfile);
    
    while (true) {
      int i = fr.read();
      if (i == -1) break;
      fw.write(i);
    }
    
    fw.close();
    fr.close();
    
  }

}
