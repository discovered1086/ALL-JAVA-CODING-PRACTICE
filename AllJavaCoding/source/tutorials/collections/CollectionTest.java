package tutorials.collections;

import java.util.*;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add(25);
		list.add(100);
		list.add(45);
		list.add('C');
		printList(list);
		list.remove(new Integer(100));
		System.out.println("After Remove");
		printList(list);
		Set s = new HashSet();
		s.add(25);
		s.add(45);
		list.retainAll(s);
		System.out.println("After RetainAll");
		printList(list);
		list.clear();
		System.out.println("After Clear");
		printList(list);
	}
	static void printList(Collection list)
	{
		Iterator iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}	
	}
	static void isNullSupported(Collection c)
	{
		boolean nullSupport = true;  
		if(c!= null)
			try{
		nullSupport = c.add(null);
			}
		catch(NullPointerException npx)
		{
			nullSupport = false;
		}
		System.out.print("\n" + c.getClass().getName() + " accept NUll Values " );
		System.out.println((nullSupport)?"true":"false");
	}
	

}
