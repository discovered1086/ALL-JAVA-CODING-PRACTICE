package mypractice.basicexamples.classandobject;

public class Animal {

	
		  public Animal(String aType) {
		    type = aType;
		  }
		  public String toString() {
		    return "This is a " + type;
		  }
		  private String type;
		
		  public static void main(String[] a) {
		    Animal pet = new Animal("a");
		    if (pet.getClass() == Animal.class) {
		      System.out.println("it is an animal!");
		    }
		  }
	}
		