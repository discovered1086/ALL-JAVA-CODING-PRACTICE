package com.kingshuk.corejava.basic.intterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StockMarketProgram {

	public static void main(String[] args) {
		System.out.println("The highest difference is: " + maxDifference(Arrays.asList(5, 10, 8, 7, 6, 5)));
	}

	public static int maxDifference(List<Integer> px) {
	    // Write your code here
	    
	    int maxDifference = 0;
	    
	    for(int i=0; i < px.size(); i++){
	        if(i==0){
	            continue;
	        }
	        
	       for(int j = 0; j<i; j++){
	           if(px.get(i)> px.get(j) && (px.get(i)-px.get(j)) > maxDifference){
	               System.out.println("Adding the difference: "+ String.valueOf(px.get(i)-px.get(j)));
	               maxDifference = px.get(i)-px.get(j);
	           }
	       }
	    }
	    
	    
	    return maxDifference == 0? -1: maxDifference;
	    }

}
