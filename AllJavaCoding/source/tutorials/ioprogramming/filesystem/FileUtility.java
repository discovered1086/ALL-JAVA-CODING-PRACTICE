package tutorials.ioprogramming.filesystem;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import tutorials.ioprogramming.basicio.StreamCopier;

public class FileUtility {

  public static void move(File src, File dst, boolean overwrite) throws IOException {
  
    if (src.equals(dst)) return;
    
    if (src.isDirectory()) {
      throw new IOException("Can't move directories");
    }
    
    if (dst.isFile() && overwrite) { 
      move(src, dst);     
    }
    else if (dst.isFile() && !overwrite) {
      throw new IOException(dst + " exists");
    }
    else if (dst.isDirectory()) {
      move(src, new File(dst, src.getName()));         
    }
    // try to figure out whether user wanted a to move to a new directory
    // or a new file
    else if (dst.getPath().endsWith(System.getProperty("file.separator"))) {
      if (!dst.mkdirs()) {
        throw new IOException("Could not create " + dst);
      }
      move(src, new File(dst, src.getName()));         
    }
    else {  
      String dir = dst.getParent();
      String name = dst.getName();
      if (dir != null) {
        if (!(new File(dir)).mkdirs()) {
          throw new IOException("Could not create " + dir);
        }
      }
      move(src, dst);           
    }
    
  }

  private static void move(File src, File dest) throws IOException {
  
    FileInputStream fin = new FileInputStream(src);
    FileOutputStream fout = new FileOutputStream(dest);
    StreamCopier.copy(fin, fout);
    fout.close();
    fin.close();
    src.delete(); 
  
  }

}