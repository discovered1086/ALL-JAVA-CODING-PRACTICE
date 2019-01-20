package mypractice.string;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Sep 7, 2012
 * Time: 12:47:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class StringReplace {


    public StringReplace() {
    }

    public static void main(String[] args) {
        String replaced = "09";
        //String replacement = "N/A";
        System.out.println("before replacement: " + replaced);
        System.out.println("character at 0th index: "+replaced.charAt(0));
        if (replaced.indexOf("0") > -1 && '0'==replaced.charAt(0)) {
            replaced = replaced.replaceFirst("0", "");
        }
        System.out.println("After removing: " + replaced);
    }
}
