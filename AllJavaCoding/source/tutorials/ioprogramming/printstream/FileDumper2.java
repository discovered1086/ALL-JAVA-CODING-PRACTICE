package tutorials.ioprogramming.printstream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

import tutorials.ioprogramming.filterstream.BufferedStreamCopier;



public class FileDumper2 {

  public static final int ASC = 0;
  public static final int DEC = 1;
  public static final int HEX = 2;
  public static final int SHORT = 3;
  public static final int INT = 4;
  public static final int LONG = 5;
  public static final int FLOAT = 6;
  public static final int DOUBLE = 7;
  
  public static void main(String[] args) {

    if (args.length < 1) {
      System.err.println(
       "Usage: java FileDumper2 [-ahdsilfx] [-little] file1 file2...");
    }

    boolean bigEndian = true; 
    int firstFile = 0;
    int mode = ASC;

    // process command line switches
    for (firstFile = 0; firstFile < args.length; firstFile++) {
      if (!args[firstFile].startsWith("-")) break;
      if (args[firstFile].equals("-h")) mode = HEX;
      else if (args[firstFile].equals("-d")) mode = DEC;
      else if (args[firstFile].equals("-s")) mode = SHORT;
      else if (args[firstFile].equals("-i")) mode = INT;
      else if (args[firstFile].equals("-l")) mode = LONG;
      else if (args[firstFile].equals("-f")) mode = FLOAT;
      else if (args[firstFile].equals("-x")) mode = DOUBLE;
      else if (args[firstFile].equals("-little")) bigEndian = false;
    }

    for (int i = firstFile; i < args.length; i++) {
      switch (mode) {
        case DEC:
          dumpDecimal(args[i]);
          break;
        case HEX:
          dumpHex(args[i]);
          break;
        case SHORT:
          if (bigEndian) dumpShort(args[i]);
          else dumpLittleEndianShort(args[i]);
          break;
        case INT:
          if (bigEndian) dumpInt(args[i]);
          else dumpLittleEndianInt(args[i]);
          break;
        case LONG:
          if (bigEndian) dumpLong(args[i]);
          else dumpLittleEndianLong(args[i]);
          break;
        case FLOAT:
          if (bigEndian) dumpFloat(args[i]);
          else dumpLittleEndianFloat(args[i]);
          break;
        case DOUBLE:
          if (bigEndian) dumpDouble(args[i]);
          else dumpLittleEndianDouble(args[i]);
          break;
        default:
          dumpAscii(args[i]);
          break;
      }
      if (i < args.length-1) {  // more files to dump
        System.out.println();
        System.out.println("------------" + args[i] + "------------");
        System.out.println();
      }
    }

  }

  public static void dumpShort(String filename) {

    DataInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new DataInputStream(fin);
      try {
        while (true) {
          short s = din.readShort();
          System.out.println(s);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpInt(String filename) {

    DataInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new DataInputStream(fin);
      try {
        while (true) {
          int i = din.readInt();
          System.out.println(i);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpLong(String filename) {

    DataInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new DataInputStream(fin);
      try {
        while (true) {
          long l = din.readLong();
          System.out.println(l);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpLittleEndianShort(String filename) {

    LittleEndianInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new LittleEndianInputStream(fin);
      try {
        while (true) {
          short s = din.readShort();
          System.out.println(s);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpLittleEndianInt(String filename) {

    LittleEndianInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new LittleEndianInputStream(fin);
      try {
        while (true) {
          int i = din.readInt();
          System.out.println(i);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpLittleEndianLong(String filename) {

    LittleEndianInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new LittleEndianInputStream(fin);
      try {
        while (true) {
          long l = din.readLong();
          System.out.println(l);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }
  
  public static void dumpFloat(String filename) {

    DataInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new DataInputStream(fin);
      try {
        while (true) {
          float f = din.readFloat();
          System.out.println(f);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpDouble(String filename) {

    DataInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);

      din = new DataInputStream(fin);
      try {
        while (true) {
          double d = din.readDouble();
          System.out.println(d);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpLittleEndianFloat(String filename) {

    LittleEndianInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);
      din = new LittleEndianInputStream(fin);
      try {
        while (true) {
          float f = din.readFloat();
          System.out.println(f);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpLittleEndianDouble(String filename) {

    LittleEndianInputStream din = null; 

    try {
      FileInputStream fin = new FileInputStream(filename);

      din = new LittleEndianInputStream(fin);
      try {
        while (true) {
          double d = din.readDouble();
          System.out.println(d);
        }
      }
      catch (EOFException e) {
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (din != null) din.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpAscii(String filename) {

    FileInputStream fin = null;

    try {
      fin = new FileInputStream(filename);
      BufferedStreamCopier.copy(fin, System.out);
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (fin != null) fin.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpDecimal(String filename) {

    FileInputStream fin = null;
    byte[] buffer = new byte[20];
    boolean end = false;
    int bytesRead;

    try {
      fin = new FileInputStream(filename);
      while (!end) {
        bytesRead = 0;
        while (bytesRead < buffer.length) {
          int r = fin.read(buffer, bytesRead, buffer.length - bytesRead);
          if (r == -1) {
            end = true;
            break;
          }
          bytesRead += r;
        }
        for (int i = 0; i < bytesRead; i++) {
          int dec = buffer[i];
          if (dec < 0) dec = 256 + dec;
          if (dec < 10) System.out.print("00" + dec + " ");
          else if (dec < 100) System.out.print("0" + dec + " ");
          else System.out.print(dec + " ");
        }
        System.out.println();
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (fin != null) fin.close();
       }
      catch (IOException e) {
      }
    }

  }

  public static void dumpHex(String filename) {

    FileInputStream fin = null;
    byte[] buffer = new byte[24];
    boolean end = false;
    int bytesRead;

    try {
      fin = new FileInputStream(filename);
      while (!end) {
        bytesRead = 0;
        while (bytesRead < buffer.length) {
          int r = fin.read(buffer, bytesRead, buffer.length - bytesRead);
          if (r == -1) {
            end = true;
            break;
          }
          bytesRead += r;
        }
        for (int i = 0; i < bytesRead; i++) {
          int hex = buffer[i];
          if (hex < 0) hex = 256 + hex;
          if (hex >= 16) System.out.print(Integer.toHexString(hex) + " ");
          else System.out.print("0" + Integer.toHexString(hex) + " ");
        }
        System.out.println();
      }
    }
    catch (IOException e) {
      System.err.println(e);
    }
    finally {
      try {
        if (fin != null) fin.close();
       }
      catch (IOException e) {
      }
    }

  }

}