package tutorials.ioprogramming.filesystem;

import java.io.File;
import java.io.FilenameFilter;

public class HTMLFilter implements FilenameFilter {

 public boolean accept(File directory, String name) {
 
   if (name.endsWith(".html")) return true;
   if (name.endsWith(".htm")) return true;
   return false;
 
 }

}
