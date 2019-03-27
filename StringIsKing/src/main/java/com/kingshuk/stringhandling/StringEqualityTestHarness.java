package com.kingshuk.stringhandling;

public class StringEqualityTestHarness {
    public static void main(String[] args) {
        String hello1="hello";
        String hello2="hello";

        String hello1Object=new String("hello");
        String hello2Object=new String("hello");

        System.out.println(hello1==hello2);
        System.out.println(hello1.equals(hello2));
        System.out.println(hello1==hello1Object);
        System.out.println(hello1==hello1Object);
        System.out.println(hello2Object==hello1Object);
        System.out.println(hello2Object.equals(hello1Object));
    }
}
