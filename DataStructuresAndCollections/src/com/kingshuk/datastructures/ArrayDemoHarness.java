package com.kingshuk.datastructures;

import java.util.Arrays;

public class ArrayDemoHarness {

    public static void main(String[] args) {
        //Declaring an array
        int [] intArray;

        //Declaring and allocation memory to an array
        Double [] doubles=new Double[3];
        doubles[0]=89.00;
        doubles[1]=100.89;
        doubles[2]=878.23;

        System.out.println(Arrays.toString(doubles));

        String [] strings={"Kingshuk", "Deeksha", "Tommy"};

        System.out.println(Arrays.toString(strings));
    }
}
