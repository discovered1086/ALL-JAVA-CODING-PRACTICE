package tutorials.ioprogramming.datastream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Vector;

import tutorials.ioprogramming.basicio.StreamCopier;


public class SequencePrinter {

  public static void main(String[] args) {

    Vector theStreams = new Vector();

    for (int i = 0; i < args.length; i++) {
       try {
         FileInputStream fin = new FileInputStream(args[i]);
         theStreams.addElement(fin);
       }
       catch (IOException e) {
         System.err.println(e);
       }
    }

    SequenceInputStream sin = new SequenceInputStream(theStreams.elements());
    try {
      StreamCopier.copy(sin, System.out);
    }
    catch (IOException e) {
      System.err.println(e);
    }

  }
 
}
