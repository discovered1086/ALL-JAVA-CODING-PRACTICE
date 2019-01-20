package tutorials.collections;

import java.util.*;

public class FirstCollection implements Comparable<FirstCollection>{
String name1;
String name2;
	public String getName1() {
	return name1;
}

public void setName1(String name1) {
	this.name1 = name1;
}

public String getName2() {
	return name2;
}

public void setName2(String name2) {
	this.name2 = name2;
}

	public static void main(String[] args) {
		List <String> l=new ArrayList<String>();
		l.add("kingshuk");
		l.add("deeksha");
		l.add("deottima");
		l.add("rahul");
		System.out.println(l.size());
		System.out.println("unsorted list "+l);
		Collections.sort(l);
		System.out.println("sorted list "+l);
		FirstCollection fc =new FirstCollection();
		fc.setName1("kingshuk");
		fc.setName2("deeksha");
		FirstCollection fc2=new FirstCollection();
		fc2.setName2("rahul");
		System.out.println(fc.compareTo(fc2));
		
	}

	public int compareTo(FirstCollection fc1) {
		
		return this.getName1().compareTo(fc1.getName2());
	}

}
