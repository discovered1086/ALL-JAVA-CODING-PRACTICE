package mypractice.memorymanagement.garbagecollection;

import java.util.Objects;

/**
 * Created by kingshuk on 7/20/17.
 */
public class InternalizedString {
    /**
     * This method describes what we call string internalization. JVMs have become smart now a days
     * they do NOT create two string on the heap if their values are the same. they put them into something called a string
     * pool, so that they can later be reused. This way the JVM makes the most efficient decision for us.
     *
     * However this only works for literal strings. Any computed strings are not put into the string pool
     * by default. If we want JVM to do that we need to use intern() method on the computed string
     * examples 1, 2and 3 describe the behavior of literal strings vs computed strings and the usage of intern respectively.
     * @param args
     */
    public static void main(String [] args){
        //Example 1: literal strings
        String hello1="Hello";
        String hello2="Hello";

        System.out.println("Do hello1 and hello2 point to same object? "+(hello1==hello2));

        System.out.println("Are the two string the same object? "+ hello1.equals(hello2));

        //Example 2: Computed strings
        String hello3="ABCDHello".substring(4);

        System.out.println("The value of hello3 is "+hello3);

        System.out.println("Do hello1 and hello3 point to same object? "+(hello1==hello3));

        System.out.println("Are the two string the same object? "+ hello1.equals(hello3));

        //Example 3: Forcing the computed string into the string pool by using intern method
        String hello4="ABCDEFGHHello".substring(8).intern();

        System.out.println("The value of hello4 is "+hello4);

        System.out.println("Do hello1 and hello4 point to same object? "+(hello1==hello4));

        System.out.println("Are the two string the same object? "+ hello1.equals(hello4));

    }
}
