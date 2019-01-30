package com.kingshuk.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueTestHarness {

    public static void main(String[] args) {
        Queue<String> theQueue=new LinkedList<>();

        theQueue.add("Joey");
        theQueue.add("Ross");
        theQueue.add("Monica");
        theQueue.add("Chandler");
        theQueue.add("Phoebe");
        theQueue.add("Rachel");

        System.out.println(theQueue);

        String recentlyRemoved= theQueue.remove();
        System.out.println(recentlyRemoved +" got recently removed");
        System.out.println(theQueue);

        //Looking at the next element in the queue without removing it
        String nextItem=theQueue.peek();
        System.out.println("Next up "+nextItem);

        String polledRecently = theQueue.poll();
        System.out.println(polledRecently+" got removed from the queue");

        System.out.println(theQueue);

        /*for (int i=0;i<theQueue.size(); i++){
            System.out.println("Next up "+friend);
            String friendGotRemoved=theQueue.poll();
            System.out.println(friendGotRemoved+" got removed");
            System.out.println(theQueue);
        }*/

        //This is the best way to remove elements from any data structure
        // while iterating over it
        while(!theQueue.isEmpty()){
            System.out.println("Next up "+theQueue.peek());
            String friendGotRemoved=theQueue.poll();
            System.out.println(friendGotRemoved+" got removed");
            System.out.println(theQueue);
        }

    }
}
