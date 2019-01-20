package mypractice.basicexamples.classandobject;


		  

public class GradeBook
{
	private String courseName; // course name for this GradeBook

	   // method to set the course name
	   public void setCourseName( String name )
	   {
	      courseName = name; // store the course name
	   }

	   // method to retrieve the course name
	   public String getCourseName()
	   {
	      return courseName;
	   }

   public void displayMessage( )
   {
	      System.out.printf( "Welcome to the grade book for\n%s!\n",courseName );
	   }
   public static void main( String args[] )
   { 
	  GradeBook myGradeBook = new GradeBook(); 

      System.out.printf( "Initial course name is: %s\n\n",myGradeBook.getCourseName() );

      String theName = "Java";
      myGradeBook.setCourseName( theName ); // set the course name

      myGradeBook.displayMessage();
   }

}