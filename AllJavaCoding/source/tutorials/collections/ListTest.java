package tutorials.collections;

import java.util.*;

public class ListTest {

	 static Vector v = new Vector();
	 static ArrayList list = new ArrayList();
	 static{
		// populateData(v);
		
	 }
	 
	 static void populateData(Collection c)
	 {
		 for(int i = 0 ; i <=20; i++ )
			 c.add(i* 100);
	 }
	 
	 
	 static void startThreads()
	 {
		 Runnable vectorThreadAdd = new Runnable(){
			 public void run(){
				vectorAddTest(); 
			 }
		 };
		 Runnable vectorThreadRemove = new Runnable(){
			 public void run(){
				 vectorRemoveTest();
			 } 
		 };
		 Thread t1 = new Thread(vectorThreadAdd,"Thread1");
		 Thread t2 = new Thread(vectorThreadAdd,"Thread2");
		 
		 t1.start();
		 t2.start();
		 
	 }
	 
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		startThreads();
		printVector(v);
		
	}
	static synchronized void vectorAddTest(){
		 for(int i = 0 ; i <=20; i++ )
		 { 
			 sleep(100);
			 v.add(Thread.currentThread().getName() + " " + (i* 100));
		 }
	}
	static void sleep(int miliseconds){
		try{
			Thread.sleep(miliseconds);
		}
		catch(InterruptedException iex)
		{
			iex.printStackTrace();
		}
	}
	
    static void vectorRemoveTest(){
		
	}
	
	static void printVector(Vector v){
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
		{
			System.out.println(enu.nextElement());
		}
	}
	
	static void arrayListTest()
	{
		
	}
}













/* ArrayList alist = new ArrayList();
		for(float f = 0.0f ; f <= 5.0f; f += .50f )
		{
		 alist.add(new Float (f));	
		}
		
		CollectionTest.printList(alist);
		  alist.set(1, 1.0f);
		System.out.println("After Set");
		for(int i = 0 ; i<alist.size(); i ++)
		{
			System.out.println(alist.get(i));
		}*/