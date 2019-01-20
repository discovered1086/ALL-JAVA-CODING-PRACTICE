package mypractice.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: co21321
 * Date: 3/18/15
 * Time: 5:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestRegEx {

    public static void main(String[] args) {
        String userName="David Leo";

        if (userName != null && !userName.equals("")) {
            Pattern p = Pattern.compile("[^A-Za-z'. &-]");
            Matcher m = p.matcher(userName);
            boolean found=  m.find();
            if (found || userName.contains(" ")){
                System.out.print("There is something wrong with the user name");
            }
        }
    }
}
