package tutorials.ioprogramming.serialization;import java.util.*;import java.util.zip.*;import java.io.*;import java.lang.reflect.*;import java.awt.*;public class listSerializable12 {  public static void main(String[] args) {      String[] prefixes = { "java.applet",     "java.awt",     "java.awt.datatransfer",     "java.awt.event",     "java.awt.image",     "java.beans",     "java.io",     "java.lang",     "java.lang.reflect",     "java.math",     "java.net",     "java.rmi",     "java.rmi.dgc",     "java.rmi.registry",     "java.rmi.server",     "java.security",     "java.security.acl",     "java.security.interfaces",     "java.sql",     "java.text",     "java.util",     "java.util.zip",     "com.sun.image.codec.jpeg", "com.sun.java.accessibility","com.sun.java.swing","com.sun.java.swing.border", "com.sun.java.swing.event","com.sun.java.swing.plaf","com.sun.java.swing.table","com.sun.java.swing.text", "com.sun.java.swing.text.html", "com.sun.java.swing.text.rtf", "com.sun.java.swing.tree", "com.sun.java.swing.undo",  "java.awt.color",  "java.awt.dnd",  "java.awt.font", "java.awt.geom", "java.awt.im", "java.awt.image.renderable", "java.awt.print", "java.beans.beancontext", "java.lang.ref",  "java.rmi.activation", "java.security.cert", "java.util.jar", "java.util.mime", "org.omg.CORBA",  "org.omg.CORBA.ContainedPackage",  "org.omg.CORBA.ContainerPackage",  "org.omg.CORBA.InterfaceDefPackage",  "org.omg.CORBA.ORBPackage", "org.omg.CORBA.portable", "org.omg.CORBA.TypeCodePackage", "org.omg.CosNaming", "org.omg.CosNaming.NamingContextPackage" };      String classname = "";    FileDialog fd = new FileDialog(new Frame(), "Please locate classes.zip: ", FileDialog.LOAD);    fd.setVisible(true);    String filename = fd.getDirectory() + fd.getFile();     /*   try {      prefix = args[0];      if (!prefix.endsWith(".")) prefix += ".";    }    catch (ArrayIndexOutOfBoundsException e) {        }  */        for (int i = 0; i < prefixes.length; i++) {      String prefix = prefixes[i] + ".";      System.out.println(prefix + ":\n");      try {        ZipFile zf = new ZipFile(filename);        Enumeration files = zf.entries();        while (files.hasMoreElements()) {          ZipEntry ze = (ZipEntry) files.nextElement();          classname = ze.getName().replace('/','.');          if (classname.startsWith(prefix) && classname.endsWith(".class")             && !classname.startsWith("sun.tools.javadoc.MIFPrintStream")             && !classname.startsWith("sun.awt.motif.X11Selection.class")            && !classname.startsWith("sun.awt.tiny.TinyWindowFrame")            && !classname.startsWith("sun.awt.tiny.TinyMenuBarPeer")) {  //          System.err.println(classname);            classname = classname.substring(0,classname.length() - 6);             try {              Class thisClass = Class.forName(classname);              classname = classname.substring(prefix.length());               if (classname.indexOf('.') != -1 || classname.indexOf('$') != -1 ) continue;               if (implementsSerializable(thisClass)) {                System.out.print(classname + ", ");              }            }            catch (InternalError ie) {              System.err.println(ie);            }          }        }       }      catch (ClassNotFoundException e) {        System.err.println(e + " " + classname);        }        catch (Exception e) {        System.err.println(e);        }        catch (Throwable t) {       System.err.println(t);     }        System.out.println();    }        System.exit(0);      }  public static boolean implementsSerializable(Class c) {      Class[] theInterfaces  = c.getInterfaces();    for (int i = 0; i < theInterfaces.length; i++) {      if (theInterfaces[i].getName().endsWith("Serializable")) {        return true;      }    }    return false;      }}