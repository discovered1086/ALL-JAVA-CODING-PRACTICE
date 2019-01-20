package tutorials.ioprogramming.serialization;
import java.util.*;
import java.io.*;
import java.net.*;


public class SerializableVector extends Vector 
 implements Externalizable {

  public void writeExternal(ObjectOutput out) throws IOException {

   out.writeInt(capacityIncrement);
   out.writeInt(elementCount);
   for (int i = 0; i < elementCount; i++) {
     if (elementData[i] instanceof Serializable) {
       out.writeObject(elementData[i]);
     }
     else {
       out.writeObject(null);
     }
 
    }  

  }

  public void readExternal(ObjectInput in) 
   throws IOException, ClassNotFoundException {

   this.capacityIncrement = in.readInt();
   this.elementCount = in.readInt();
   this.elementData = new Object[elementCount];
   for (int i = 0; i < elementCount; i++) {
     elementData[i] = in.readObject();
   }

  }   

  public static void main(String[] args) throws Exception {

    SerializableVector sv1 = new SerializableVector();
    sv1.addElement("Element 1");
    sv1.addElement(new Integer(9));
    sv1.addElement(new URL("http://www.oreilly.com/"));

    // not Serializable
    sv1.addElement(new Socket("www.ora.com", 80));

    sv1.addElement("Element 1");
    sv1.addElement(new Integer(9));
    sv1.addElement(new URL("http://www.oreilly.com/"));

    ByteArrayOutputStream bout = new ByteArrayOutputStream();
    ObjectOutputStream temp = new ObjectOutputStream(bout);
    temp.writeObject(sv1);
    temp.close();

    ByteArrayInputStream bin = new ByteArrayInputStream(bout.toByteArray());
    ObjectInputStream oin = new ObjectInputStream(bin);
    Vector v = (Vector) oin.readObject();
    Enumeration e = v.elements();
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement());
    }

  }

}
