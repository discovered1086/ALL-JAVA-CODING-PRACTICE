package tutorials.ioprogramming.charset;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.security.GeneralSecurityException;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;

import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import tutorials.ioprogramming.printstream.DoubleFilter;
import tutorials.ioprogramming.printstream.FloatFilter;
import tutorials.ioprogramming.printstream.IntFilter;
import tutorials.ioprogramming.printstream.LEDoubleFilter;
import tutorials.ioprogramming.printstream.LEFloatFilter;
import tutorials.ioprogramming.printstream.LEIntFilter;
import tutorials.ioprogramming.printstream.LELongFilter;
import tutorials.ioprogramming.printstream.LEShortFilter;
import tutorials.ioprogramming.printstream.LittleEndianInputStream;
import tutorials.ioprogramming.printstream.LongFilter;
import tutorials.ioprogramming.printstream.ShortFilter;
import tutorials.ioprogramming.basicio.StreamCopier;
import tutorials.ioprogramming.filterstream.DecimalFilter;
import tutorials.ioprogramming.filterstream.HexFilter;



public class FileDumper6 {

  public static final int ASC    = 0;
  public static final int DEC    = 1;
  public static final int HEX    = 2;
  public static final int SHORT  = 3;
  public static final int INT    = 4;
  public static final int LONG   = 5;
  public static final int FLOAT  = 6;
  public static final int DOUBLE = 7;

  public static void dump(InputStream in, OutputStream out, int mode, 
   boolean bigEndian, boolean deflated, boolean gzipped, String password) 
   throws IOException {
    
    // The reference variable in may point to several different objects
    // within the space of the next few lines. 
      
    if (password != null && !password.equals("")) {
      // create a key
      try {
        byte[] desKeyData = password.getBytes();
        DESKeySpec desKeySpec = new DESKeySpec(desKeyData);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = keyFactory.generateSecret(desKeySpec);

        // use Data Encryption Standard
        Cipher des = Cipher.getInstance("DES/ECB/PKCS5Padding");
        des.init(Cipher.DECRYPT_MODE, desKey);
        
        in = new CipherInputStream(in, des);
      }
      catch (GeneralSecurityException e) {
        throw new IOException(e.getMessage());
      }
    }
    
    if (deflated) {
      in = new InflaterInputStream(in);
    }
    else if (gzipped) {
      in = new GZIPInputStream(in);
    }

    // could really pass to FileDumper3 at this point
    if (bigEndian) {
      DataInputStream din = new DataInputStream(in);
      switch (mode) {
        case HEX: 
          in = new HexFilter(in);
          break;
        case DEC: 
          in = new DecimalFilter(in);
          break;
        case INT: 
          in = new IntFilter(din);
          break;
        case SHORT: 
          in = new ShortFilter(din);
          break;
        case LONG: 
          in = new LongFilter(din);
          break;
        case DOUBLE: 
          in = new DoubleFilter(din);
          break;
        case FLOAT: 
          in = new FloatFilter(din);
          break;
        default:
      }
    }
    else {
      LittleEndianInputStream lin = new LittleEndianInputStream(in);
      switch (mode) {
        case HEX: 
          in = new HexFilter(in);
          break;
        case DEC: 
          in = new DecimalFilter(in);
          break;
        case INT: 
          in = new LEIntFilter(lin);
          break;
        case SHORT: 
          in = new LEShortFilter(lin);
          break;
        case LONG: 
          in = new LELongFilter(lin);
          break;
        case DOUBLE: 
          in = new LEDoubleFilter(lin);
          break;
        case FLOAT: 
          in = new LEFloatFilter(lin);
          break;
        default:  
      }
      
    }   
    
    StreamCopier.copy(in, out);
    in.close();
    
  }

  public static void dump(InputStream in, OutputStream out, 
   String inputEncoding, String outputEncoding, boolean deflated, 
   boolean gzipped, String password) throws IOException {
    
    if (inputEncoding == null || inputEncoding.equals("")) {
      dump(in, out, ASC, true, deflated, gzipped, password);
      return;
    }
    
    if (outputEncoding == null || outputEncoding.equals("")) {
      outputEncoding = System.getProperty("file.encoding", "8859_1");
    }
    
    // Note that the reference variable in
    // may point to several different objects
    // within the space of the next few lines
        
    if (password != null && !password.equals("")) {
      try {
        // create a key
        byte[] desKeyData = password.getBytes();
        DESKeySpec desKeySpec = new DESKeySpec(desKeyData);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey desKey = keyFactory.generateSecret(desKeySpec);

        // use Data Encryption Standard
        Cipher des = Cipher.getInstance("DES/ECB/PKCS5Padding");
        des.init(Cipher.DECRYPT_MODE, desKey);
          
        in = new CipherInputStream(in, des);
      }
      catch (GeneralSecurityException e) {
        throw new IOException(e.getMessage());
      }
    }        
        
    if (deflated) {
      in = new InflaterInputStream(in);
    }
    else if (gzipped) {
      in = new GZIPInputStream(in);
    }
      
    InputStreamReader isr = new InputStreamReader(in, inputEncoding);
    OutputStreamWriter osw = new OutputStreamWriter(out, outputEncoding);  
        
    int c;
    while ((c = isr.read()) != -1) {
      osw.write(c);
    }
    isr.close();
    osw.close();
                
  }
  
}
