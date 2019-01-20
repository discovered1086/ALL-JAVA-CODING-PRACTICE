package tutorials.ioprogramming.charset;


import java.io.*;

public class SourceReader extends FilterReader {

  public SourceReader(InputStream in) {
    this(new InputStreamReader(in));
  }

  public SourceReader(Reader in) {
    super(new BufferedReader(in));
  }

  private int backslashParity = 1;

  public int read() throws IOException {
  
    int c = in.read();
    if (c != '\\') return c;
   
    backslashParity *= -1;
   // If there are an even number of backslashes, 
   // this is not a Unicode escape
   if (backslashParity == 1) return c;
   
   // Mark is supported because I used 
   // a BufferedReader in the constructor 
   in.mark(1);
   int next = in.read();
   if (next != 'u' ) { // This is not a Unicode escape
     in.reset();
     return c;
   }
   // read next 4 hex digits
   // If the next four chars do not make a valid hex digit
   // this is not a valid .java file and you need 
   // a compiler error
   StringBuffer sb = new StringBuffer();
   sb.append((char) in.read());
   sb.append((char) in.read());
   sb.append((char) in.read());
   sb.append((char) in.read());
   String hex = sb.toString();  
   try {
     return Integer.valueOf(hex, 16).intValue();
   }
   catch (NumberFormatException e) {
     throw new IOException("Bad Unicode escape");  
   }
   
  }
 
  public int read(char[] text, int offset, int length) throws IOException {
  
    int numRead = 0;
    for (int i = offset; i < offset+length; i++) {
      int temp = this.read();
      if (temp == -1) break;
      text[i] = (char) temp;
      numRead++;
    }
    return numRead;
  
  }

  public long skip(long n) throws IOException {

    char[] c = new char[(int) n];
    int numSkipped = this.read(c);
    return numSkipped;
    
  }

}
