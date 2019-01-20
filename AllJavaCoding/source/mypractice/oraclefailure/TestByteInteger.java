package mypractice.oraclefailure;

/**
 * Created with IntelliJ IDEA.
 * User: Kingshuk
 * Date: 4/12/14
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestByteInteger {
    public static void main(String [] args){
       byte b=9;
       printValue(b,b,b);
    }

    private static void printValue(int x,int y,int z){
        System.out.println("Comes in first printValue method with 3 integers");
    }

    private static void printValue(byte...b){
        System.out.println("Comes in second printValue method with variable aruguements of bytes");

    }
}
