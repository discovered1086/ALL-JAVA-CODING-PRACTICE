package tutorials.ioprogramming.serialization;
import java.security.*;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.awt.*;

public class UnsealPoint {

  public static void main(String[] args) {
  
    String filename = "point.des";
    
    try {
      FileInputStream fin = new FileInputStream(filename);
      ObjectInputStream oin = new ObjectInputStream(fin);
      
      // create a key
      byte[] desKeyData = {(byte) 0x90, (byte) 0x67, (byte) 0x3E, (byte) 0xE6, 
       (byte) 0x42, (byte) 0x15, (byte) 0x7A, (byte) 0xA3 };
      DESKeySpec desKeySpec = new DESKeySpec(desKeyData);
      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
      SecretKey desKey = keyFactory.generateSecret(desKeySpec);
      
      SealedObject so = (SealedObject) oin.readObject();
      
      Point p = (Point) so.getObject(desKey);
      System.out.println(p);
      oin.close();
    }
    catch (ClassNotFoundException e) {
      System.err.println(e);
    }
    catch (IOException e) {
      System.err.println(e);
    }
    catch (GeneralSecurityException e) {
      System.err.println(e);
    }
  
  }

}
