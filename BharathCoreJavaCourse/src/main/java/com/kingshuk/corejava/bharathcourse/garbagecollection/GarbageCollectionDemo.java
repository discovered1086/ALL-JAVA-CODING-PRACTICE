package com.kingshuk.corejava.bharathcourse.garbagecollection;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class GarbageCollectionDemo {
	
	int objectId;

	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new GarbageCollectionDemo(i);
			System.out.println("Object with ID "+i+ " has been created");
		}				
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized " +this.objectId);
	}

}
