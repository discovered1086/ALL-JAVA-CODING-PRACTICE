package tutorials.ioprogramming.serialization;
import java.security.*;
import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.*;
import java.awt.*;

public class SealedPoint {

  public static void main(String[] args) {
  
    String filename = "point.des";
    Point tdp = new Point(32, 45);
    
    try {
      FileOutputStream fout = new FileOutputStream(filename);
      ObjectOutputStream oout = new ObjectOutputStream(fout);
      
      // create a key
      byte[] desKeyData = {(byte) 0x90, (byte) 0x67, (byte) 0x3E, (byte) 0xE6, 
       (byte) 0x42, (byte) 0x15, (byte) 0x7A, (byte) 0xA3 };
      DESKeySpec desKeySpec = new DESKeySpec(desKeyData);
      SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
      SecretKey desKey = keyFactory.generateSecret(desKeySpec);
      
      // use Data Encryption Standard
      Cipher des = Cipher.getInstance("DES/ECB/PKCS5Padding");
      des.init(Cipher.ENCRYPT_MODE, desKey);

      SealedObject so = new SealedObject(tdp, des);
      oout.writeObject(so);
      oout.close();
    }
    catch (IOException e) {
      System.err.println(e);
    }
    catch (GeneralSecurityException e) {
      System.err.println(e);
    }
  
  }

}
