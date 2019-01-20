package mypractice.string;

/**
 * Created by IntelliJ IDEA.
 * User: CO21321
 * Date: Sep 18, 2012
 * Time: 1:24:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class PlayWithAccountNumber {


    public static void main(String[] args) {
        String accountSaved = "30911566592";
        String fromTheUI = "98XXXX78XXXXXXXXX65929878";
        System.out.println("The account number or message returned is :" + new PlayWithAccountNumber().getUpdatedBankAccountInfo(accountSaved, fromTheUI));

    }

    private String getUpdatedBankAccountInfo(String numberSaved, String fromTheUI) {
        String returnVal = null;

        int lastINdex = fromTheUI.lastIndexOf("X");
        int charIdentified=0;
        StringBuffer buffer = new StringBuffer(1024);
        System.out.println("The last index of X is :" + lastINdex);

        if (fromTheUI.indexOf("X") > -1) {
            for (int i = 0; i <= lastINdex; i++) {
                if (fromTheUI.charAt(i) == 'X') {
                    System.out.println("The index of X is :" + charIdentified);
                    buffer.append(numberSaved.charAt(charIdentified));
                    charIdentified++;
                    System.out.println("Buffer till now is: " + buffer.toString());
                } else {
                    buffer.append(fromTheUI.charAt(i));
                }

            }
            buffer.append(fromTheUI.substring(lastINdex + 1));
            System.out.println("The whole buffer is :" + buffer.toString());
            if (!buffer.toString().equals(numberSaved))
                returnVal = "GO TO HELL";
            else
                returnVal = "YOU DIDN'T MODIFY THE ACCOUNT NUMBER";
        } else
            returnVal = "YOU HAVE ENTERED A FRESH ACCOUNT NUMBER..BRAVO..!!!";
        return returnVal;
    }
}
