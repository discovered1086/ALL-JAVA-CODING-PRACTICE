package mypractice.string;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Oct 1, 2013
 * Time: 7:57:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class CutAString {

    public static void main(String[] args) {
        String message1 = "Hartford adds to the peace of mind of getting my bills and other necessities make up the difference between SSD and your salary that you were receiving, as SSD is well below the salary you were... Hartford adds to the peace of mind of getting my bills and other necessities make up the difference between SSD and your salary that you were receiving, as SSD is well below the salary you were making. Hartford makes it to where your base pay is there. I have had to contact Hartford very few times during this time period and have found the answer on the very first call. My information is in the computer so any agent can follow your case number, therefore usually just the one call takes care of the situation. I recommend all employee's who have this available to them, get it. If you find yourself disable, Hartford is the company you want to back you up. \n" +
                "";
        String message="long textjhghjgj";
        String finalText=new CutAString().abbreviatedString(message,7);
        System.out.println("The cut of String is \n" + finalText);
        System.out.println("Message lenghth "+ message.length());
    }

    public String abbreviatedString(String input, int cutOfCharacter) {
        String abbreviatedString = "";
        abbreviatedString = input.substring(0, cutOfCharacter);
        int lastIndexOf = abbreviatedString.lastIndexOf(' ');
        /*if (lastIndexOf == abbreviatedString.length()-1) {
            return abbreviatedString+"...";
        } else
        if (abbreviatedString.charAt(abbreviatedString.length()-1) == '.' || abbreviatedString.charAt(abbreviatedString.length()-1) == '?' || abbreviatedString.charAt(abbreviatedString.length()-1) == '!')
            return abbreviatedString+"...";
        else if(lastIndexOf>-1){
            return abbreviatedString.substring(0, lastIndexOf) + "...";
        }  */
        /*if(lastIndexOf>-1){
          if(lastIndexOf == abbreviatedString.length()-1){
             return abbreviatedString+"...";
          }else{
              return abbreviatedString.substring(0, lastIndexOf) + "...";
          }
        }else{
          return abbreviatedString+"...";
        }  */

        if (lastIndexOf > -1) {
            return abbreviatedString.substring(0, lastIndexOf) + "...";
        } else
            return abbreviatedString + "...";

    }
}
