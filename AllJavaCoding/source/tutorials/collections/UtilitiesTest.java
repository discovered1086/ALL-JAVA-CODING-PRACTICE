package tutorials.collections;

import java.util.*;

public class UtilitiesTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List elist = new ArrayList(30);
		elist.add(10);
		elist.add(30);
		elist.add(40);
		// Bulk Addition
		Collections.addAll(elist,90,70,80,60);
		// Sort
		Collections.sort(elist);
		// Binary Search
		System.out.println(Collections.binarySearch(elist, 40));
		// immutable Collection
		Collection l =  Collections.unmodifiableCollection(elist);
		addToCollection(l, 56);
		// Thread Safe Collection 
		List tlist = Collections.synchronizedList(elist);
		// reverse 
		Collections.reverse(elist);

	}
	static void addToCollection(Collection c, int element)
	{
		try{
			c.add(element);
		}
		catch(Exception iex){
			iex.printStackTrace();
		}
	}
	
	static void arrayUtility(){
	int arr [] = {9,87,4,15,23,65,148};
		
		// Array to List
		List list = Arrays.asList(arr);
		// Binary Search  -n not found otherwise 
		// index postion of the element in array
		System.out.println(Arrays.binarySearch(arr, 23));
		System.out.println(Arrays.binarySearch(arr, 19));
		// Sort
		Arrays.sort(arr);
		for(int n : arr)
			System.out.print(n + " ");
		System.out.println();
		// copy of selected length of element 
		// from array
		int narr [] = Arrays.copyOf(arr, 5);
		// copy range of array elements
		int rarr [] = Arrays.copyOfRange(arr, 3, 6);
		for(int n : narr)
			System.out.print(n + " ");
		System.out.println();
		for(int n : rarr)
			System.out.print(n + " ");
		System.out.println();
		// fill array with a common value
		Arrays.fill(arr, 10);
		for(int n : arr)
			System.out.print(n + " ");
	}
}
