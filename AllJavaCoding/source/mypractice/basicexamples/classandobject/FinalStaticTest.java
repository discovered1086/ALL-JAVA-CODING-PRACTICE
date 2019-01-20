package mypractice.basicexamples.classandobject;

public class FinalStaticTest {
	
	   final 
	   static int classField;

	   static
	   {
	      classField = 29;
	      System.out.println("first Static Block");
	   }
	   
	   static 
	   {
		   System.out.println("another Static Block");
	   }

	   public static void main (String [] args)
	   {
	      System.out.println (classField);
	      // classField = 30;
	   }
	}