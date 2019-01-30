package com.kingshuk.datastructures;

import java.util.Stack;

public class StackTestHarness {

    public static void main(String[] args) {
        Stack<String> theStack=new Stack<>();

        theStack.push("Joey");
        theStack.push("Ross");
        theStack.push("Monica");
        theStack.push("Chandler");
        theStack.push("Phoebe");
        theStack.push("Rachel");

        System.out.println(theStack);

        while(!theStack.isEmpty()){
            System.out.println("Next up "+theStack.peek());
            String friendGotRemoved=theStack.pop();
            System.out.println(friendGotRemoved+" got removed");
            System.out.println(theStack);
        }
    }
}
