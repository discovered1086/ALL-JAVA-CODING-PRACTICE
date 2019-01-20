package mypractice.string;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 8/2/15
 * Time: 7:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class LastCharacterRemoval {
    public static void main(String [] args){
        String text = "kingshuk.mukherjee@thehartford.com,GBITMPSDigital@thehartford.com,";

        text = text.substring(0, text.length() - 1) + "";

        System.out.println(text);
    }
}
