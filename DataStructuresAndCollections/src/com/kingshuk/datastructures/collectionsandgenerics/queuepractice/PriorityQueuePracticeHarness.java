package com.kingshuk.datastructures.collectionsandgenerics.queuepractice;

import java.util.NoSuchElementException;
import java.util.Queue;

import com.kingshuk.datastructures.collectionsandgenerics.utility.CommonCollectionGenerator;

/** This class is to practice priority queue methods and features
 * Created by CO21321 on 2/5/2018.
 */
public class PriorityQueuePracticeHarness {

    public static void main(String[] args) {
        Queue<String> priorityQueue = CommonCollectionGenerator.getPriorityQueue();

        System.out.println("The whole queue: " + priorityQueue);  //Is not naturally ordered. But why???

        System.out.println("The first element: "+priorityQueue.peek());

        System.out.println("The removed element: "+priorityQueue.poll());

        System.out.println("The whole queue after removal of one element: " + priorityQueue);  //Now it becomes ordered. Strange..!!

        //Now time to check the element and remove methods when the queue is empty
        for (int i = 0; i <=3 ; i++) {
            priorityQueue.poll();
        }

        System.out.println("The first element in the queue (Using peek) is: "+priorityQueue.peek());

        try{
            System.out.println("The first element in the queue (using element) is: "+priorityQueue.element());
        }catch (NoSuchElementException ex){
            System.out.println("Got a NoSuchElementException while calling the element method");
        }

        System.out.println("The element removed from the queue (Using poll) is: "+priorityQueue.poll());

        try{
            System.out.println("The element removed from the queue (using remove) is: "+priorityQueue.remove());
        }catch (NoSuchElementException ex){
            System.out.println("Got a NoSuchElementException while calling the remove method");
        }
    }
}
