package tutorials.ioprogramming.filterstream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;



public class MultiCopier {

  public static void main(String[] args) {

    if (args.length < 2) {
      System.out.println("Usage: java MultiCopier infile outfile1 outfile2...");   
      return;
    }

    try {
      FileInputStream fin = new FileInputStream(args[0]);
      FileOutputStream fout1 = new FileOutputStream(args[1]);
      MultiOutputStream mout = new MultiOutputStream(fout1);
      for (int i = 2; i < args.length; i++) {
        mout.addOutputStream(new FileOutputStream(args[i]));      
      }
      BufferedStreamCopier.copy(fin, mout);
      fin.close();
      mout.close();
    }
    catch (IOException e) {
      System.err.println(e);    
    }

  }

} 
