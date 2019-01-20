package tutorials.collections;

import java.util.*;

public class NavigableSetTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeSet tnumbers = new TreeSet();
		for(int i = 0; i <10; i++)
			tnumbers.add(58+(i*2));
		CollectionTest.printList(tnumbers);
		NavigableSet ns = tnumbers;
		System.out.println(ns.pollFirst());
		System.out.println(ns.pollLast());
		// 60 >=  ceiling    74 <= floor
		// 60 > higher      74 < lower
		System.out.println(ns.ceiling(60) + " " + ns.floor(74));
		System.out.println(ns.higher(60) + " " + ns.lower(74));
		System.out.println("Navigable Set");
		CollectionTest.printList(ns);
	
	}
	

}
