package mypractice.inheritance;

public class Animal {
	  public Animal(String aType) {
		    type = new String(aType);
		  }
		  public String toString() {
		    return "This is a " + type;
		  }
		  private String type;
		}
		class Dog extends Animal {
		  public Dog(String aName) {
		    super("Dog");
		    name = aName; 
		    breed = "Unknown";
		  }
		  public Dog(String aName, String aBreed) {
		    super("Dog"); 
		    name = aName;
		    breed = aBreed;
		  }
		  public String toString() {
		    return "It's " + name + " the " + breed;
		  }
		  private String name; 
		  private String breed;
		}
